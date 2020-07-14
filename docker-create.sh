#!/bin/bash
docker create -e PERSON-SERVICE-IP=person-service -e PERSON-SERVICE-PORT=8080 -p 9090:8080 --name hello-service --network spring-services-ntw alessiofiore/spring-k8s-hello-service:1.0.0
docker create -p 9091:8080 --name person-service --network spring-services-ntw alessiofiore/spring-k8s-person-service:1.0.0
