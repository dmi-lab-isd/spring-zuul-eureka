#!/bin/bash -x

mvn package -DskipTests
docker build --tag sum-server:latest .