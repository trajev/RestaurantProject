@echo off

REM ====== CLEAN ======
echo Cleaning old class files...
del /S /Q *.class

REM ====== COMPILE ======
echo Compiling Java files...
javac -cp ".\lib\mysql-connector-j-9.4.0.jar" Main.java ./model/*.java ./service/*.java ./repository/*.java ./lib/*.java

IF %ERRORLEVEL% NEQ 0 (
    echo Compilation failed!
    exit /b %ERRORLEVEL%
)

REM ====== RUN ======
echo Running Main class...
java -cp ".\lib\mysql-connector-j-9.4.0.jar" Main.java
    