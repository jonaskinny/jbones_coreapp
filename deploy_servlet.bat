set APP_DEPLOY=.\deploy
set SERVLET_DEPLOY=C:DATA\servers\apache-tomcat-6.0.16\webapps

copy %APP_DEPLOY%\jbones_coreapp.war %SERVLET_DEPLOY%\jbones_coreapp.war

