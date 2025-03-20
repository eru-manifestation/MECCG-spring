# Use an official OpenJDK 21 image
FROM eclipse-temurin:21-jdk AS build

WORKDIR /app

# Copy project files
COPY . .

# Ensure correct Java version
RUN java -version

# Run Maven build
RUN chmod +x ./mvnw && ./mvnw clean package -DskipTests

# Use a smaller JDK 21 runtime image
FROM eclipse-temurin:21-jre AS runtime
WORKDIR /app

# Copy built JAR from build stage
COPY --from=build /app/target/*.jar app.jar

# Pass system environment variables to container environment variables
ARG DATABASE_URL
ARG DB_USERNAME
ARG DB_PASSWORD

ENV DATABASE_URL=${DATABASE_URL}
ENV DB_USERNAME=${DB_USERNAME}
ENV DB_PASSWORD=${DB_PASSWORD}

# Run the application
# CMD ["java", "-jar", "app.jar"]
