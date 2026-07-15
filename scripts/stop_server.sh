#!/bin/bash

echo "Stopping existing Spring Boot application..."

pkill -f learnCICDPipelineProject || true