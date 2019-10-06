# Sample Microservice for the MicroProfile

This service is a dependency for the Bestell Service ( https://github.com/predic8/microprofile-demo-bestell-service )

## Start Server

 ./mvnw compile quarkus:dev
 

## Request a Price
 
curl  http://localhost:8081/preis/Kaffee -v
