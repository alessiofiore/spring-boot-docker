# spring-boot-docker
Basic architecture with 2 Spring Boot applications with Docker and K8S
    
## Kubernates
### Create components
    kubectl apply -f mysql-volume.yaml
    kubectl apply -f mysql-deployment.yaml
    kubectl apply -f hello-deployment.yaml
    kubectl apply -f hello-service.yaml
    kubectl apply -f person-deployment.yaml
    kubectl apply -f person-service.yaml
    kubectl apply -f ingress.yaml 
    kubectl create secret generic dbpassword --from-literal MYSQL_ROOT_PASSWORD_PERSON=password123
    kubectl get ingress (Read Ingress address)
    
### Components management
#### Delete    
    kubectl delete -n default deployment hello-ws-deployment
    kubectl delete -n default service hello-ws-cluster-ip-service
    kubectl delete -n default deployment person-ws-deployment
    kubectl delete -n default service person-ws-cluster-ip-service
    kubectl delete -n default ingress ingress-service
    
## Test
curl <ingress-service-ip>/hello
    
# TODOs
* Add volume
* Add DB image used by person -> person read from DB and return value to person
* Circuit breaker person