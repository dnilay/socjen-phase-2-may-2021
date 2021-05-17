FROM openjdk:8-jdk-alpine
EXPOSE 8010
ADD target/*.jar app.jar
ENTRYPOINT ["sh", "-c", "java -jar /app.jar"]