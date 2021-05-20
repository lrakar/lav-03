@echo off
set path="C:\Program Files\Java\jdk-16\bin";
echo compile
javac AutoReport.java
pause
echo output:
echo -------------
java AutoReport
echo -------------
echo done
pause