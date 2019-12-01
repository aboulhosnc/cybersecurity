import requests
import re

username = 'natas11'
password = 'U82q5TCMMQ9xuFoI3dYX61s7OZD9JKoK'

url = 'http://%s.natas.labs.overthewire.org/index-source.html' % username

session = requests.Session()
response = session.get(url, auth =(username, password))

content = response.text
print (content)
