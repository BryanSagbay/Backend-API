<div align="center" id="top"> 
  <img src="https://www.tutofox.com/wp-content/uploads/2023/02/Full.png"  height="300" width="600" alt="ServiceOpenAI" />
</div>

# Api Scouting Player 🔭 
Esta API proporciona endpoints para la gestión de jugadores en un sistema. Permite realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) sobre entidades de jugadores.


[![Langua](https://img.shields.io/badge/SpringBoot-white?logo=Spring)](https://img.shields.io/badge/SpringBoot-purple?logo=Spring) [![Langua](https://img.shields.io/github/languages/count/BryanSagbay/Backend-API?color=c90e21 "Langua")](https://img.shields.io/github/languages/count/BryanSagbay/Backend-API?color=c90e21 "Langua") [![Git](https://img.shields.io/github/repo-size/bryansagbay/Backend-API?color=56BEB8 "Gut")](https://img.shields.io/github/repo-size/bryansagbay/Backend-API?color=56BEB8 "Gut") [![Start](https://img.shields.io/github/stars/bryansagbay/Backend-API?color=blue "Start")](https://img.shields.io/github/stars/bryansagbay/Backend-API?color=blue "Start") 

</p>


<hr> 

<br>

> ### 1. Tecnologías Utilizadas 
- Java
- Spring Boot
- Spring Data JPA
- RESTful API

<br>







> ### 2. Configuración
El código está desarrollado en Java utilizando Spring Boot y se puede ejecutar con cualquier entorno de desarrollo compatible con Spring.

<br>

>### 3. Requisitos Previos
- Java 8 o superior
- Entorno de desarrollo compatible con Spring (por ejemplo, IntelliJ IDEA, Eclipse)
- Configuración del Proyecto
- Clonar el repositorio o descargar el código fuente.
```bash
$ git clone https://github.com/BryanSagbay/Backend-API.git
```
- Abrir el proyecto en tu entorno de desarrollo.
- Asegurarse de que las dependencias estén instaladas (especificadas en el archivo pom.xml si se utiliza Maven).

<br>

>### 4. Uso
La API proporciona las siguientes operaciones sobre entidades de jugadores:
```bash
Obtener todos los jugadores:
												GET /api/jugadores
Guardar un nuevo jugador: 
												POST /api/guardarjugador
Actualizar un jugador existente:
												PUT /api/actualizarjugador
Eliminar un jugador por ID: 
												DELETE /api/eliminarjugador/{id}
```

<br>

>### 5. Detalles de las Operaciones
1. Obtener todos los jugadores: Devuelve una lista de todos los jugadores almacenados en la base de datos.
2. Guardar un nuevo jugador: Crea y almacena un nuevo jugador en la base de datos. Se espera que se proporcione un objeto JSON con los detalles del jugador en el cuerpo de la solicitud.
3. Actualizar un jugador existente: Actualiza los datos de un jugador existente en la base de datos. Se espera que se proporcione un objeto JSON con los detalles actualizados del jugador en el cuerpo de la solicitud.
4. Eliminar un jugador por ID: Elimina un jugador existente de la base de datos según su ID proporcionado en la URL.

<br> 

>#### Notas Importantes
- Todos los endpoints tienen sus propias respuestas de estado HTTP para indicar el éxito o el fallo de la operación.
- Se utiliza JugadorRepositorio para interactuar con la base de datos y realizar operaciones CRUD en la tabla de jugadores.


<br>


> ### License & Copy &copy;

Hecho por: <a href="https://github.com/BryanSagbayt" target="_blank">Bryan Sagbay</a>


------------

<a href="#top">Back to top</a>
