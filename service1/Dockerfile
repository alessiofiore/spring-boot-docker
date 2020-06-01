FROM openjdk:8-jdk-alpine
LABEL maintainer="alessiofiore@gmail.com"
COPY target/service1*.jar service1.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/service1.jar"]
