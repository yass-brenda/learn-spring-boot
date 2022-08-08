# Aprendiendo Spring 

## Dia 1 Instalación y Hola mundo

### Spring Inicializr

**Project:** 
Maven o gradle ayudan para empaquetar, gestionar y compilar las dependencias.
Maven Descarga dependencias y compila el proyecto .

**Version:** 
Elegir la que venga por defecto porque es la más actual.

**Group:** 
Es un ejemplo de tu pagina siempre viene invertido.

_Ejemplo: com.brenda -> brenda.com_

**Artifact:** 
Nombre del proyecto a nivel de clase.

**Name:**
Alias al proyecto.

**Paquete:**
Jar para aplicaciones de escritorio.
War para aplicaciones web.


### Estructura de un proyecto
**POM:**
EL pom dice que dependencias debes descargar.
El proyecto ya trae integrado tomcat que hace que corra un servidor web 

**Mvnw:**
Mvnw para ejecutar en linux
Mvnw para ejecutar en windows

Para __ejecutar en la terminal usa:__
```
mvn spring-boot:run
```

### Estructuras de archivos
__/Controllers:__ Punto inicial, recibe la petición y ejecuta la lógica principal. 
Petición web al url.

__/Services:__ Acciones permitidas en el sistema (actualiza,obten info,busca etc).

__/Repositories:__   Consulta sql o métodos de mapeo de objetos.

__/Modelo:__  Sirve para mapear una tablaen una clase java.

### Anotaciones

__@RestController:__ Indica que la clase es un controlador.

__@RequestMapping("/"):__ Indica que se ejecuta ese método cuando visitamos la raiz.
