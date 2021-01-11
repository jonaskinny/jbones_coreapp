echo off
set JAVA_HOME=
set PATH=
set CLASSPATH=


call setenv_1.4.1_02
rem call setenv_1.6.0_12

echo using CLASSPATH %_LIBJARS%
echo using JAVA_HOME %JAVA_HOME%

set CLASSPATH=%CLASSPATH%;.\deploy\jbones_coreapp.jar;.\deploy\jbones_coreapp-config.jar;
echo using classpath ...
echo %CLASSPATH%

"%JAVA_HOME%\bin\java" -classpath %CLASSPATH% org.jbones.coreapp.velocity.HelloWorld
pause