FROM maven:3.9.6-amazoncorretto-21 AS builder

COPY src/ src/
COPY pom.xml .

RUN mvn clean install -Dmaven.test.skip=true


# Use OpenJDK 15 base image
# Use a base image with ARM 64 architecture
FROM amazoncorretto:21.0.2-al2023-headless

# Create a directory in the container
RUN mkdir -p /logs

# Copy the folder from the host to the container
COPY /logs /logs

# Copy the packaged jar file into the container
COPY --from=builder target/basicapi.jar app.jar

# Expose the port the app runs on
EXPOSE 8080

# Command to run the application
CMD ["java", "-jar", "app.jar"]