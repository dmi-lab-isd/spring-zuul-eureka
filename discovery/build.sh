#!/bin/bash -x

mvn package
docker build --tag sum-discovery:latest .