# 1. Usar una imagen base de Java (selecciona la versión de tu JDK, por ejemplo 17, 21 o 23)
FROM eclipse-temurin:17-jdk-alpine

# 2. Argumento que apunta al archivo JAR generado por Maven o Gradle
ARG JAR_FILE=target/*.jar

# 3. Copiar el archivo JAR de tu proyecto al contenedor y renombrarlo a app.jar
COPY ${JAR_FILE} app.jar

# 4. Comando que se ejecutará al iniciar el contenedor
ENTRYPOINT ["java", "-jar", "/app.jar"]
