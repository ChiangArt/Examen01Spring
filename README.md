# Examen - CRUD de Tabla Staff (Base de Datos Sakila)

Este proyecto es parte del examen de la asignatura, donde se implementa un CRUD completo utilizando **Spring Boot** y **MySQL** con conexión a la base de datos `sakila`.

## 🧾 Descripción

La aplicación permite realizar las siguientes operaciones sobre la tabla `staff`:

- ✅ Listar todos los elementos.
- 🔍 Buscar un elemento por ID.
- ✏️ Actualizar un registro existente.
- ➕ Registrar un nuevo elemento.
- ❌ Eliminar un elemento por ID.

## ⚙️ Tecnologías utilizadas

- Java 17+
- Spring Boot 3+
- Spring Data JPA
- MySQL
- Lombok
- Maven

## 🔌 Configuración de la Base de Datos

En el archivo `application.properties` se ha definido la conexión a la base de datos:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/sakila
spring.datasource.username=root
spring.datasource.password=123456
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.hibernate.ddl-auto=none
spring.jpa.show-sql=true
