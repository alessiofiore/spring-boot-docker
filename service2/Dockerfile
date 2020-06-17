FROM openjdk:8-jdk-alpine
LABEL maintainer="alessiofiore@gmail.com"
COPY target/service2*.jar service2.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/service2.jar"]
