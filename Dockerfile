FROM openjdk:8-jdk-alpine
EXPOSE 8080
ADD target/SampleService-0.0.1-SNAPSHOT.jar /app.jar
ENTRYPOINT ["sh", "-c", "java -jar /app.jar"]