# Spring gRPC Server
Insecure gRPC communication between microservices.

## Overview
There are 3 types of gRPC connections:

### Insecure connection
The first one is insecure connection, which we’ve been using since the beginning of this course. In this connection, all data transferred between client and server is not encrypted.
- [Grpc Server](https://github.com/daglii/spring-grpc-server) Code example
- [Grpc Client](https://github.com/daglii/spring-grpc-client) Code example

### Secured by server-side
The second type is connection secured by server-side TLS. In this case, all the data is encrypted, but only the server needs to provide its TLS certificate to the client. You can use this type of connection if the server does not care which client is calling its API.
- Grpc Server: Will be soon
- Grpc Client: Will be soon

### Strongest type of connection secured by mutual TLS
The third and strongest type is connection secured by mutual TLS. We use it when the server also needs to verify who’s calling its services. So in this case, both client and server must provide their TLS certificates to the other.
- Grpc Server: Will be soon
- Grpc Client: Will be soon

### Getting Started
Newer communication technology with high performance.
* [gRPC](https://docs.microsoft.com/en-us/dotnet/architecture/cloud-native/grpc) More explanation about gRPC.

* [BloomRPC](https://appimage.github.io/BloomRPC/)  Tool for testing such as Postman.
## Authors

* **Milos Krsmanovic** - *Software Engineer* - [Dagli](https://github.com/daglii)

## My projects
Take a look at my other projects

- Centralized Microservice Logging with Graylog [Graylog with Spring](https://github.com/daglii/graylog-spring)
- GRPC Communication between Microservices [Grpc Server](https://github.com/daglii/spring-grpc-server) - [Grpc Client](https://github.com/daglii/spring-grpc-client)



