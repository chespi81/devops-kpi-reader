# devops-kpi-reader

Permite generar KPIs asociados a DevOps desde diferentes or�genes.

## Objetivos del proyecto

El objetivo es crear una estructura configurable y extensible que permita generar reportes en formato XML, para que puedan despu�s ser convertidos a otros formatos (texto, html, markdown o PDF).

## C�mo construir el proyecto

Se trata de un proyecto maven, por lo que la construcci�n se realiza utilizando esta herramienta, la cual debe encontrarse instalada en el equipo donde se realice la compilaci�n. Para construirlo se debe ejecutar el comando **mvn package**.

### Proyectos de dependencias

Este proyecto depende de utilizar un cliente para utilizar la API rest que publica Jenkins (y otras fuentes de informaci�n), con el fin de obtener m�tricas asociadas a los proyectos y builds.

Para compilar este proyecto **se requiere haber construido e instalado** el proyecto *java-client-api*, cuyo c�digo fuente puede ser descargado desde la siguiente direcci�n. Lo importante es basarse en la versi�n de la cual depende el proyecto (0.3.5 en la fecha en la que se gener� este documento).

https://github.com/jenkinsci/java-client-api

### Ejecuci�n de las pruebas

Con el fin de ejecutar correctamente las pruebas unitarias asociadas al proyecto, es necesario que la JVM utilizada para construir, y en particular para ejeuctar las pruebas unitarias, considere como v�lido el certificado digital del servidor jenkins p�blico https://ci.jenkins.io/

Para ello, el certificado del sitio debe incorporarse a los certificados *confiables* para la JVM. Para ello debes agregarlo utilizando la herramienta **keytool** que es parte de la distribuci�n de la JVM. Este [enlace](http://stackoverflow.com/questions/9619030/resolving-javax-net-ssl-sslhandshakeexception-sun-security-validator-validatore) explica la causa y como resolverlo de la forma correcta.

#### C�mo agregar el certificado del [jenkins p�blico](https://ci.jenkins.io/) a los certificados de confianza de la JVM.

Para visualizar el listado de certificados de confianza, se puede ejecutar el siguiente comando:

keytool -list -keystore "%JAVA_HOME%/jre/lib/security/cacerts"

Para agregar el certificado, este se debe descargar y luego agregar al listado de certificados de confianza. Para hacerlo, es **muy importante contar con la contrase�a** que permite modificar el keystore que trae la JVM. Por defecto la contrase�a es ***changeit*** [ver referencia](https://community.oracle.com/thread/1540678?start=0&tstart=0).

Este es un ejemplo de la invocaci�n al comando keytool que permite agregar el certificado almacenado en el archivo *ci.jenkins.io.cer* (descargado y exportado utilizando el navegador de internet).

keytool -import -noprompt -trustcacerts -alias ci.jenkins.io -file ci.jenkins.io.cert -keystore "%JAVA_HOME%/jre/lib/security/cacerts"