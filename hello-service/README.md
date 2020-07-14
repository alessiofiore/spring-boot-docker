# spring-boot-docker
Basic Spring Boot application with Docker

## Build package
    mvn package
    
## Docker    

### Build image
    docker build -t alessiofiore/spring-k8s-hello-service:1.0.0 .
    docker push alessiofiore/spring-k8s-hello-service:1.0.0

### Create network
    docker network create spring-services-ntw
    docker network ls
    
### Create container
    docker create -e PERSON-SERVICE-IP=person-service -e PERSON-SERVICE-PORT=8080 -p 9090:8080 --name hello-service --network spring-services-ntw alessiofiore/spring-k8s-hello-service:1.0.0 
    
### Manage container
    docker start hello-service
    docker stop hello-service
    docker logs -f hello-service
    
### Test application
    GET http://localhost:9090 -> Hello World