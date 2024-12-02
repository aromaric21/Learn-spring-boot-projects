FROM openjdk:24-slim-bullseyz

WORKDIR /app

COPY target/*.jar /app/techstore.jar

ENTRYPOINT ["java", "-jar", "/app/techstore.jar"]