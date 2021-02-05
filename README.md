# INTRODUCCIÓN AL DISEÑO DE SISTEMAS COMPUTACIONALES

Se realizó el desarrollo de una aplicación web cual busca calcular la media y la desviación estandar de un conjunto de n números, estos números son almacenados en una Linked List la cual fue implementada desde cero en el taller anterior.

  

## Pre-requisitos

*  [MAVEN](https://maven.apache.org/) - Administrador de dependencias.

*  [GIT](https://git-scm.com/) - Control de versiones.

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

## UML diagrams
Acontinuación se presenta el diseño de la arquitectura de la aplicación: 
[![](https://mermaid.ink/img/eyJjb2RlIjoiY2xhc3NEaWFncmFtXG5cbkFwcCAtLT4gTGlua2VkTGlzdCA6IFxuQXBwIC0tPiBDYWxjdWxhdG9yIDogXG5MaW5rZWRMaXN0IC0tPiBOb2RvXG5MaW5rZWRMaXN0IC0tfD4gQWJzdHJhY3RTZXF1ZW50aWFsTGlzdFxuQ2FsY3VsYXRvciAtLT4gTGlua2VkTGlzdFxuQXBwOiBnZXRQb3J0KClcbkFwcDogaW5wdXREYXRhUGFnZShSZXF1ZXN0LFJlc3BvbnNlKVxuQXBwOiByZXN1bHRQYWdlKFJlcXVlc3QsUmVzcG9uc2UpXG5MaW5rZWRMaXN0OiBOb2RvIGhlYWRcbkxpbmtlZExpc3Q6IGludCBzaXplXG5MaW5rZWRMaXN0OiBhZGRGaXJzdChkb3VibGUpXG5MaW5rZWRMaXN0OiBlbXB0eSgpXG5MaW5rZWRMaXN0OiBnZXRJbmRleChpbnQpXG5MaW5rZWRMaXN0OiByZW1vdmUoaW50KVxuTGlua2VkTGlzdDogc2l6ZSgpXG5DYWxjdWxhdG9yOiBMaW5rZWRMaXN0IGxpc3RhIFxuQ2FsY3VsYXRvcjogbWVhbigpXG5DYWxjdWxhdG9yOiBzdGFuZGFyZERldmlhdGlvbigpXG5Ob2RvOiBkb2JsZSBpdGVtXG5Ob2RvOiBOb2RvIG5leHRcbk5vZG86IGdldERhdGEoKVxuTm9kbzogZ2V0TGlua2VkKClcbk5vZG86IGxpbmsoKVxuTm9kbzogc2V0RGF0YShkb3VibGUpXG5BYnN0cmFjdFNlcXVlbnRpYWxMaXN0OiA8PEFic3RyYWN0Q2xhc3M-PiIsIm1lcm1haWQiOnsidGhlbWUiOiJmb3Jlc3QifSwidXBkYXRlRWRpdG9yIjpmYWxzZX0)](https://mermaid-js.github.io/mermaid-live-editor/#/edit/eyJjb2RlIjoiY2xhc3NEaWFncmFtXG5cbkFwcCAtLT4gTGlua2VkTGlzdCA6IFxuQXBwIC0tPiBDYWxjdWxhdG9yIDogXG5MaW5rZWRMaXN0IC0tPiBOb2RvXG5MaW5rZWRMaXN0IC0tfD4gQWJzdHJhY3RTZXF1ZW50aWFsTGlzdFxuQ2FsY3VsYXRvciAtLT4gTGlua2VkTGlzdFxuQXBwOiBnZXRQb3J0KClcbkFwcDogaW5wdXREYXRhUGFnZShSZXF1ZXN0LFJlc3BvbnNlKVxuQXBwOiByZXN1bHRQYWdlKFJlcXVlc3QsUmVzcG9uc2UpXG5MaW5rZWRMaXN0OiBOb2RvIGhlYWRcbkxpbmtlZExpc3Q6IGludCBzaXplXG5MaW5rZWRMaXN0OiBhZGRGaXJzdChkb3VibGUpXG5MaW5rZWRMaXN0OiBlbXB0eSgpXG5MaW5rZWRMaXN0OiBnZXRJbmRleChpbnQpXG5MaW5rZWRMaXN0OiByZW1vdmUoaW50KVxuTGlua2VkTGlzdDogc2l6ZSgpXG5DYWxjdWxhdG9yOiBMaW5rZWRMaXN0IGxpc3RhIFxuQ2FsY3VsYXRvcjogbWVhbigpXG5DYWxjdWxhdG9yOiBzdGFuZGFyZERldmlhdGlvbigpXG5Ob2RvOiBkb2JsZSBpdGVtXG5Ob2RvOiBOb2RvIG5leHRcbk5vZG86IGdldERhdGEoKVxuTm9kbzogZ2V0TGlua2VkKClcbk5vZG86IGxpbmsoKVxuTm9kbzogc2V0RGF0YShkb3VibGUpXG5BYnN0cmFjdFNlcXVlbnRpYWxMaXN0OiA8PEFic3RyYWN0Q2xhc3M-PiIsIm1lcm1haWQiOnsidGhlbWUiOiJmb3Jlc3QifSwidXBkYXRlRWRpdG9yIjpmYWxzZX0)

  

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

```

La documentación quedará en la ruta \target\site\apidocs\edu\eci\escuelaing\arep

  

## Ejecutando las pruebas

  

Para correr las pruebas ejecutamos la siguiente linea:

```

mvn test

```

  

## Construido con

*  [MAVEN](https://maven.apache.org/) - Administrador de dependencias.

*  [GIT](https://git-scm.com/) - Control de versiones.

*  [JUNIT](https://junit.org/junit5/) - Framework para realizar y automatizar pruebas.

* Java - Lenguaje de programación.

## Despliegue en Heroku 

* [![Deploy](https://www.herokucdn.com/deploy/button.svg)](https://dry-retreat-86008.herokuapp.com/)

## Autor

*  **Yeisson Gualdron** - [GYEISSON](https://github.com/GYEISSON)

  

## Licencia

Este proyecto está bajo la Licencia GNU(General Public License) - mira el archivo [LICENSE](LICENSE) para detalles.


