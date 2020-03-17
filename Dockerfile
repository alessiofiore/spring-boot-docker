FROM openjdk:8-jdk-alpine
MAINTAINER Alessio Fiore
ADD target/spring-boot-docker*.jar spring-boot-docker.jar
VOLUME /tmp
EXPOSE 8080
ENTRYPOINT java -jar /spring-boot-docker.jar
