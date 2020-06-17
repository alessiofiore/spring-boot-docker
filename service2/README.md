# spring-boot-docker
Basic Spring Boot application with Docker

## Build package
    mvn package
    
## Docker    

### Build Docker image
    docker build -t alessiofiore/spring-docker-k8s-service2:1.0.0 .
    docker push alessiofiore/spring-docker-k8s-service2:1.0.0
    
### Run Docker container
    docker create -p 9091:8080 --name service2 --network spring-services-ntw alessiofiore/spring-docker-k8s-service2:1.0.0
    
    docker start service2
    docker stop service2
    
### Test application
    GET http://localhost:9091 -> World