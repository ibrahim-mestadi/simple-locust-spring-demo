# Use the official Maven image as the base image
FROM maven:3.6.3-openjdk-11-slim AS builder

# Set the working directory to /app
WORKDIR /app

# Copy the pom.xml file to the container
COPY pom.xml .

# Download the project dependencies
RUN mvn dependency:go-offline -B

# Copy the project source code to the container
COPY src/ ./src/

# Build the project
RUN mvn package -DskipTests

# Use a lightweight image with OpenJDK JRE 11 installed
FROM adoptopenjdk:11-jre-hotspot

# Set the working directory to /app
WORKDIR /app

# Copy the JAR file from the previous stage to the container
COPY --from=builder /app/target/*.jar ./app.jar

# Expose port 8080 for the application
EXPOSE 8080

# Set the command to run the application when the container starts
CMD ["java", "-jar", "app.jar"]
