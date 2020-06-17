# spring-boot-docker
Basic Spring Boot application with Docker

## Build package
    mvn package
    
## Docker    

### Build image
    docker build -t alessiofiore/spring-docker-k8s-service1:1.0.0 .
    docker push alessiofiore/spring-docker-k8s-service1:1.0.0

### Create network
    docker network create spring-services-ntw
    docker network ls
    
### Create container
    docker create -e SERVICE2-IP=service2 -e SERVICE2-PORT=8080 -p 9090:8080 --name service1 --network spring-services-ntw alessiofiore/spring-docker-k8s-service1:1.0.0 
    
### Manage container
    docker start service1
    docker stop service1
    docker logs -f service1
    
### Test application
    GET http://localhost:9090 -> Hello World