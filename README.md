# spring-boot-docker
Basic Spring Boot application with Docker

## Build package
    mvn package
    
## Docker    

### Build Docker image
    docker build -t alessiofiore/spring-boot-docker:1.0 .
    docker push alessiofiore/spring-boot-docker:1.0
    
### Run Docker container
    docker run -p 9090:8080 --name spring-boot-docker alessiofiore/spring-boot-docker:1.0
    
    docker start spring-boot-docker
    docker stop spring-boot-docker
    
### Test application
    GET http://localhost:9090 -> Hello world
    
    
## Kubernates
    kubectl apply -f k8s-deployment.yaml
    kubectl apply -f k8s-service.yaml
    kubectl apply -f k8s-ingress.yaml 
    kubectl get ingress (Read Ingress address)
    
    
    kubectl delete -n default deployment service1-ws-deployment
    kubectl delete -n default service service1-ws-cluster-ip-service
    kubectl delete -n default ingress ingress-service