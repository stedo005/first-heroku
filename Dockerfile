FROM openjdk:17

ADD target/spring-for-docker-0.0.1-SNAPSHOT.jar app.jar

CMD [ "sh", "-c", "java -jar /app.jar"]