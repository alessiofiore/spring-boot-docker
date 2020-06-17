# spring-boot-docker
Basic architecture with 2 Spring Boot applications with Docker and K8S
    
## Kubernates
### Create components
    kubectl apply -f service1-deployment.yaml
    kubectl apply -f service1-service.yaml
    kubectl apply -f service2-deployment.yaml
    kubectl apply -f service2-service.yaml
    kubectl apply -f ingress.yaml 
    kubectl get ingress (Read Ingress address)
    
### Components management
#### Delete    
    kubectl delete -n default deployment service1-ws-deployment
    kubectl delete -n default service service1-ws-cluster-ip-service
    kubectl delete -n default deployment service2-ws-deployment
    kubectl delete -n default service service2-ws-cluster-ip-service
    kubectl delete -n default ingress ingress-service
    
# TODOs
* Pass env params to docker image
* Add volume
* Add DB image used by service2 -> service2 read from DB and return value to service2