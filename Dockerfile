FROM openjdk:8-jdk-alpine
LABEL maintainer="alessiofiore@gmail.com"
COPY target/spring-boot-docker*.jar spring-boot-docker.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/spring-boot-docker.jar"]
