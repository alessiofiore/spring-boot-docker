FROM openjdk:8-jdk-alpine
LABEL maintainer="alessiofiore@gmail.com"
COPY target/person-service*.jar person-service.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/person-service.jar"]
