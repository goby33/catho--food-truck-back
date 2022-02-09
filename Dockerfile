FROM amazoncorretto:11-alpine-jdk
ADD target/printing-service-*.jar /app/printing-service.jar
ENTRYPOINT ["java","-jar","/printing-service.jar"]
