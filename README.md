# microservices-eureka-demo

This is a simple Eureka Server.

## Installation

Once you have checked out this repository, go to the base directory and build it using maven

```bash
maven clean install
```

## Running the application

Once the project is successfully built, you can run the following command:

```bash
java -jar .\target\eureka-1.jar
```

The application would run at the configured port and act as a discovery server for all your micro-services.