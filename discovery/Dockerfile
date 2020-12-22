FROM openjdk:11 
WORKDIR /app
COPY target/discovery-0.0.1-SNAPSHOT.jar /app
ENV SERVER_PORT 5000
EXPOSE $SERVER_PORT
CMD ["java", "-jar", "discovery-0.0.1-SNAPSHOT.jar" ]
