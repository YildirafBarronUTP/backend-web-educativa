# Etapa 1: Construcción (Descarga dependencias y compila el código)
FROM maven:3.9.6-eclipse-temurin-21-alpine AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

# Etapa 2: Ejecución (Levanta el servidor con un entorno ligero)
FROM eclipse-temurin:21-jre-alpine
WORKDIR /app
COPY --from=build /app/target/webEducativa-1.0-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]