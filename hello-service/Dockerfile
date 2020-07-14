FROM openjdk:8-jdk-alpine
LABEL maintainer="alessiofiore@gmail.com"
COPY target/hello-service*.jar hello-service.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/hello-service.jar"]
