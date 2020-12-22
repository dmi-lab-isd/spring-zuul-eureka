#!/bin/bash -x

for service in client server gateway discovery; do
	cd $service
	./build.sh
	cd ..
done