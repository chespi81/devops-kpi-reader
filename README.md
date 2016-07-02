# devops-kpi-reader

## Descripcion general

Permite generar KPIs asociados a DevOps desde diferentes or�genes.

## Objetivos del proyecto

El objetivo es crear una estructura configurable y extensible que permita generar reportes en formato XML, para que puedan despu�s ser convertidos a otros formatos (texto, html, markdown o PDF).

## Como construir el proyecto

Se trata de un proyecto maven, por lo que la construcci�n se realiza utilizando esta herramienta, la cual debe encontrarse instalada en el equipo donde se realice la compilaci�n.

### Dependencias

Este proyecto depende de utilizar un cliente para utilizar la API rest que publica Jenkins (y otras fuentes de informaci�n), con el fin de obtener m�tricas asociadas a los proyectos y builds.

Para compilar este proyecto **se requiere haber construido e instalado** el proyecto *java-client-api*, cuyo c�digo fuente puede ser descargado desde la siguiente direcci�n.

https://github.com/jenkinsci/java-client-api

### Ejecucion de las pruebas

Con el fin de ejecutar correctamente las pruebas unitarias asociadas al proyecto, es necesario que la JVM utilizada para construir, y en particular para ejeuctar las pruebas unitarias, considere como v�lido el certificado digital del servidor jenkins p�blico https://ci.jenkins.io/

Para ello, el certificado del sitio debe incorporarse a los certificados *confiables* para la JVM. Para ello debes agregarlo utilizando la herramienta **keytool** que es parte de la distribuci�n de la JVM.

[http://stackoverflow.com/questions/9619030/resolving-javax-net-ssl-sslhandshakeexception-sun-security-validator-validatore](http://stackoverflow.com/questions/9619030/resolving-javax-net-ssl-sslhandshakeexception-sun-security-validator-validatore)

Para visualizar el listado de certificados de confianza, se puede ejecutar el siguiente comando.

keytool -list -keystore "%JAVA_HOME%/jre/lib/security/cacerts"

Es importante contar con la contrase�a que permite modificar el keystore que trae la JVM.

[https://community.oracle.com/thread/1540678?start=0&tstart=0](https://community.oracle.com/thread/1540678?start=0&tstart=0)

Por ejemplo:

keytool -import -noprompt -trustcacerts -alias ci.jenkins.io -file ci.jenkins.io.cert -keystore "%JAVA_HOME%/jre/lib/security/cacerts"

### Construcci�n

Estas son las instrucciones para construir el proyecto.