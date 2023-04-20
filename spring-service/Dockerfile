# Use the official Maven image as the base image
FROM maven:3.6.3-openjdk-11-slim AS builder

WORKDIR /app

COPY pom.xml .

RUN mvn dependency:go-offline -B

COPY src/ ./src/

RUN mvn package -DskipTests

FROM adoptopenjdk:11-jre-hotspot

WORKDIR /app

COPY --from=builder /app/target/*.jar ./app.jar

EXPOSE 8080

CMD ["java", "-jar", "app.jar"]