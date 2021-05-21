@echo off
set path="C:\Program Files\Java\jdk-16\bin";
echo compile
javac Autoreport.java
pause
echo output:
echo -------------
java Autoreport
echo -------------
echo done
pause