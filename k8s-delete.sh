#!/bin/bash
kubectl delete -n default deployment hello-ws-deployment
kubectl delete -n default deployment person-ws-deployment

kubectl delete -n default service hello-ws-cluster-ip-service
kubectl delete -n default service person-ws-cluster-ip-service


kubectl delete -n default secret dbpassword