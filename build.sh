#!/bin/bash

cd hello-service
mvn clean package
docker build -t alessiofiore/spring-k8s-hello-service:1.0.0 .

cd ../person-service
mvn clean package
docker build -t alessiofiore/spring-k8s-person-service:1.0.0 .

cd ..

