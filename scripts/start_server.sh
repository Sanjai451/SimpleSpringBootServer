#!/bin/bash

cd /home/ubuntu

echo "Starting Spring Boot application..."

nohup java -jar learnCICDPipelineProject-0.0.1-SNAPSHOT.jar > application.log 2>&1 &