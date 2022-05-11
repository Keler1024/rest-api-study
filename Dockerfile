FROM amazoncorretto:11
ADD target/books-rest-api.jar books-rest-api.jar
ENTRYPOINT ["java", "-jar","books-rest-api.jar"]
EXPOSE 8081