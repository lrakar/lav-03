@echo off
set path="C:\Program Files\Java\jdk-16\bin";
echo compile
javac PorociloGenerator.java
pause
echo output:
echo -------------
java PorociloGenerator
echo -------------
echo done
pause