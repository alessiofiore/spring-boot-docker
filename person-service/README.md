# spring-boot-docker
Basic Spring Boot application with Docker

## Build package
    mvn package
    
## Docker    

### Build image
    docker build -t alessiofiore/spring-k8s-person-service:1.0.0 .
    docker push alessiofiore/spring-k8s-person-service:1.0.0
    
### Create container
    docker create -p 9091:8080 --name person-service --network spring-services-ntw alessiofiore/spring-k8s-person-service:1.0.0
    
### Manage container
    docker start person-service
    docker stop person-service
    docker logs -f person-service
    
### Test application
    GET http://localhost:9091 -> World