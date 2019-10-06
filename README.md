# Sample Microservice for the MicroProfile

This service is a dependency for the Bestell Service ( https://github.com/predic8/microprofile-demo-bestell-service )

The Service is demonstrated on YouTube. See https://youtu.be/XwkqRCXAhiI ( German!)

## Start Server

 ./mvnw compile quarkus:dev
 

## Request a Price
 
curl  http://localhost:8081/preis/Kaffee -v
