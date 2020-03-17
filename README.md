# spring-boot-docker
Basic Spring Boot application with Docker

## Build package
    mvn package
    
## Build Docker image
    docker build -t alessiofiore/spring-boot-docker:1.0 .
    
## Run Docker container
    docker run -p 9090:8080 --name spring-boot-docker alessiofiore/spring-boot-docker:1.0
    
    docker start spring-boot-docker
    docker stop spring-boot-docker
