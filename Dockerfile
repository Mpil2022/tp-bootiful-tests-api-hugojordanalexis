FROM adoptopenjdk/openjdk11:latest
EXPOSE 8080
COPY ./target/AdderAPI-0.0.1-SNAPSHOT.jar AdderAPI-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/AdderAPI-0.0.1-SNAPSHOT.jar"]
