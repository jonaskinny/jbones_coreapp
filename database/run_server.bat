echo off
set JAVA_HOME=
set PATH=
set CLASSPATH=

rem call setenv_1.4.1_02
call setenv_1.6.0_12

echo using CLASSPATH %_LIBJARS%
echo using JAVA_HOME %JAVA_HOME%

"%JAVA_HOME%\bin\java" -classpath %_LIBJARS% org.hsqldb.server.Server --database.0 file:mydb --dbname.0 xdb

pause