echo off
set CLASSPATH=
set TOOLS=C:\jbones\jbones_core\tools
set JAVA_HOME=%TOOLS%\jdk1.6.0_12
set PROJECT_ROOT=C:\jbones\jbones_coreapp
set _LIBJARS=
for %%i in (%PROJECT_ROOT%\lib\*.*) do call cpappend.bat %%i
for %%i in (%PROJECT_ROOT%\lib\ext\*.*) do call cpappend.bat %%i
for %%i in (%TOOLS%\*.*) do call cpappend.bat %%i
for %%i in (%JAVA_HOME%\lib\*.*) do call cpappend.bat %%i
set CLASSPATH=%CLASSPATH%;%_LIBJARS%

