# spring-boot-docker
Basic Spring Boot application with Docker

## Build package
    mvn package
    
## Docker    

### Build Docker image
    docker build -t alessiofiore/spring-docker-k8s-service1:1.0.0 .
    docker push alessiofiore/spring-docker-k8s-service1:1.0.0
    
### Run Docker container
    docker run -p 9090:8080 --name service1 alessiofiore/spring-docker-k8s-service1:1.0.0
    
    docker start service1
    docker stop service1
    
### Test application
    GET http://localhost:9090 -> Hello world
    
    
## Kubernates
    kubectl apply -f service1-deployment.yaml
    kubectl apply -f service1-service.yaml
    kubectl apply -f ingress.yaml 
    kubectl get ingress (Read Ingress address)
    
    
    kubectl delete -n default deployment service1-ws-deployment
    kubectl delete -n default service service1-ws-cluster-ip-service
    kubectl delete -n default ingress ingress-service