FROM adoptopenjdk/openjdk11:latest
COPY target/AdderAPI-0.0.1-SNAPSHOT.jar AdderAPI-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/AdderAPI-0.0.1-SNAPSHOT.jar"]