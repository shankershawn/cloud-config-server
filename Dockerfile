FROM eclipse-temurin:11-jdk-alpine
VOLUME /app
ARG JAR_FILE
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]