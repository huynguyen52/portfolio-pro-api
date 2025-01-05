# Use an official OpenJDK runtime as a parent image
# change to jdk 21

FROM openjdk:21-jdk

# Set the working directory
WORKDIR /app

# Copy the Maven wrapper and pom.xml
COPY mvnw pom.xml ./

# Copy the .mvn directory
COPY .mvn .mvn

# Copy the source code
COPY src src

# Package the application
RUN ./mvnw package -DskipTests

# Expose the port the application runs on
EXPOSE 8080

# Run the application
CMD ["java", "-jar", "target/portfolio-pro-api-0.0.1-SNAPSHOT.jar"]