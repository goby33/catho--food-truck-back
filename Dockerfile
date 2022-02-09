FROM amazoncorretto:11-alpine-jdk
COPY target/printing-service.jar printing-service.jar
ENTRYPOINT ["java","-jar","/printing-service.jar"]
