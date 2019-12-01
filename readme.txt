Chady Aboulhosn
10/25/19
CMSC 413

First I searched for  all the DNS Spoof Sources I could find to understand the problem
I found a pretty good video with an explanation
https://www.youtube.com/watch?v=7-MPdMGEXHc&t=106s
I also found a good website by through google for dns Spoofing
https://www.thepythoncode.com/article/make-dns-spoof-python
and a source that did not use netfilterqueue which caused some problems
https://github.com/Trackbool/DerpNSpoof/blob/master/DerpNSpoof.py

For all of the sources though you would need to import scapy as well as NetfilterQueue
this can be done with pip install if you have sudo permission
The exact command is
apt-get install build-essential python-dev libnetfilter-queue-dev

I ended up using the source from youtube as it was very explainable

To start off with you need to install all the dependencies
sudo pip install scapy
apt-get install build-essential python-dev libnetfilter-queue-dev
sudo apt-get install iptables

Once you have that you need to activate the iptabels
use the command first  sudo iptables -I OUTPUT -j NFQUEUE --queue-num 0
then the command sudo iptables -I INPUT -j NFQUEUE --queue-num 0

Then run the program sudo python dnspsn.py

In a new command line window make sure you have the cmd open and return
ping -c 1 www.amazon.com (or any website that you choose to use)
in the code itself you choose the website you want to target (in this case amazon)
and the website you want to spoof it with.

Finally go to a browser and test that it works with the website
It will work with the website name and the ip address of the website.
