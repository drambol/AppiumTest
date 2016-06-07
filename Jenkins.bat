@ECHO off

cd C:\Softwares\Jenkins
start java -jar jenkins.war --httpPort=8084

ping 127.0.0.1 -n 15 > nul
taskkill /F /IM conhost.exe