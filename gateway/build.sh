#!/bin/bash -x

mvn package
docker build --tag sum-gateway:latest .