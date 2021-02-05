# TAREA DE INTRODUCCIÓN
Se realizó el desarrollo de una aplicación web cual busca calcular la media y la desviación estandar de un conjunto de n números, estos números son almacenados en una Linked List la cual fue implementada desde cero.

## Pre-requisitos
* [MAVEN](https://maven.apache.org/) - Administrador de dependencias.
* [GIT](https://git-scm.com/) - Control de versiones.
Para estar seguro de las versiónes que posee de maven, git y de java ejecute los siguientes comandos:
```
mvn -version
```
```
git --version
```
```
java -version
```
## Instalación 
Para descargar el proyecto desde GitHub ejecute la siguiente linea:
```
git clone https://github.com/GYEISSON/AREP_Taller2
```

## Ejecutar
Dentro del directorio AREP_Taller2, para compilar ejecutamos la siguiente linea:
```
mvn package
```
Para ejecutar el proyecto ejecutamos la siguiente linea:
```
java -cp target/taller2-1.0-SNAPSHOT.jar edu.eci.escuelaing.arep.App
```
Para ejecutar desde Heroku CLI ejecutamos la siguiente linea:
```
heroku local web 
```
Para generar la documentación ejecutamos la siguiente linea: 
```
mvn javadoc:javadoc

## Ejecutando las pruebas

Para correr las pruebas ejecutamos la siguiente linea:
```
mvn test
```

## Construido con
* [MAVEN](https://maven.apache.org/) - Administrador de dependencias.
* [GIT](https://git-scm.com/) - Control de versiones.
* [JUNIT](https://junit.org/junit5/) - Framework para realizar y automatizar pruebas.
* Java - Lenguaje de programación.

## Autor
* **Yeisson Gualdron** - [GYEISSON](https://github.com/GYEISSON)

## Licencia
Este proyecto está bajo la Licencia GNU(General Public License) - mira el archivo [LICENSE](LICENSE) para detalles.
