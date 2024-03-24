# Spring Kafka Streams using Spring Cloud Streams End to End example
.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties

(C:\MahiSW\kafka_2.12-3.6.0>.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties)

.\bin\windows\kafka-server-start.bat .\config\server.properties
## Endpoint
- http://localhost:8080/domain/lookup/facebook - to pull all facebook related web domain names

## Microservices
- 'domain-crawler' - uses Spring Kafka
- 'domain-processor' - uses Spring Cloud Stream with Kafka Streams binder
- 'domain-service' - uses Spring Cloud Stream with Kafka Streams binder

## Architecture
![architecture](architecture.png)
