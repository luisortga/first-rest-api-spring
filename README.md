# Mi Primera API REST con Spring Boot

API REST desarrollada con **Java**, **Spring Boot**, **MySQL** y **Maven**.
Este proyecto tiene como objetivo aprender la creación de servicios REST utilizando una arquitectura básica backend.

---

# Tecnologías utilizadas

* Java 17+
* Spring Boot
* Spring Web
* Spring Data JPA
* MySQL
* Maven
* Hibernate

---

# Características

* CRUD completo
* Conexión a base de datos MySQL
* Arquitectura REST
* Uso de Maven para dependencias
* Persistencia con JPA/Hibernate
* Respuestas en formato JSON

---

# Estructura del proyecto

```bash
src/
 ├── main/
 │   ├── java/
 │   │   └── com/example/api/
 │   │       ├── controller/
 │   │       ├── service/
 │   │       ├── repository/
 │   │       ├── model/
 │   │       └── ApiApplication.java
 │   │
 │   └── resources/
 │       └── application.properties
 │
 └── test/
```

---

# Instalación y ejecución

## 1. Clonar el repositorio

```bash
git clone https://github.com/tu-usuario/tu-repositorio.git
```

---

## 2. Entrar al proyecto

```bash
cd tu-repositorio
```

---

## 3. Configurar MySQL

Crear una base de datos en MySQL:

```sql
CREATE DATABASE spring_api;
```

---

## 4. Configurar `application.properties`

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/spring_api
spring.datasource.username=root
spring.datasource.password=tu_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```

---

## 5. Ejecutar el proyecto

### Con Maven Wrapper

Windows:

```bash
mvnw spring-boot:run
```

Linux/Mac:

```bash
./mvnw spring-boot:run
```

---

# Endpoints de ejemplo

## Obtener todos los registros

```http
GET /api/users
```

---

## Obtener un registro por ID

```http
GET /api/users/{id}
```

---

## Crear un registro

```http
POST /api/users
```

### Body JSON

```json
{
  "name": "Ortega",
  "email": "ortega@example.com"
}
```

---

## Actualizar un registro

```http
PUT /api/users/{id}
```

---

## Eliminar un registro

```http
DELETE /api/users/{id}
```

---

# Dependencias Maven principales

```xml
<dependencies>

    <!-- Spring Boot Web -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>

    <!-- Spring Data JPA -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-jpa</artifactId>
    </dependency>

    <!-- MySQL -->
    <dependency>
        <groupId>com.mysql</groupId>
        <artifactId>mysql-connector-j</artifactId>
        <scope>runtime</scope>
    </dependency>

</dependencies>
```

---

# Compilar el proyecto

```bash
mvn clean install
```

---

# Ejecutar pruebas

```bash
mvn test
```

---

# Objetivo del proyecto

Este proyecto fue creado como práctica para aprender:

* APIs REST
* Spring Boot
* Java backend
* Bases de datos relacionales
* MySQL
* Arquitectura MVC
* Hibernate/JPA

---

# Autor

Desarrollado por **Ortega**

---

# Licencia

Este proyecto es de uso educativo y libre para modificar.
