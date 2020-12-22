#!/bin/bash -x

mvn package -DskipTests
docker build --tag sum-client:latest .