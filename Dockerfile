FROM eclipse-temurin:17-jre-alpine
WORKDIR /app

# On copie l'application compilée par Maven
COPY target/web-app-1.0-SNAPSHOT.jar app.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
