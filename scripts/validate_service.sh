#!/bin/bash

echo "Validating application..."

sleep 10

if pgrep -f learnCICDPipelineProject > /dev/null
then
    echo "Application is running."
    exit 0
else
    echo "Application failed to start."
    exit 1
fi