#  Spring Boot - Kafka  

This project is a spring boot app that use Apache Kafka for the processing of realtime messages.  

## Features  

- **Integration with Kafka**: Use Spring Kafka to produce and consume messages in a effective way.  
- **Convention over configuration**: Aprovecha la autoconfiguración de Spring Boot para una configuración sencilla de Kafka.  
- **API RESTful**: This project is always improving,as you can see with the others repo.I looking forward to improve this project and convert this project in a total architecture could be a great step.  
- **Handle of messages**: Implements producer and consumer of Kafka to processing messages.  
- **Serialización/Deserialización**: Use JSON to serialization and deserialization of messages.  

## Previous requisites  

- Java 17  
- Maven 3.6 or higher  
- Kafka 3.8.0   

## Use summary  
1.Download Apache Kafka: https://downloads.apache.org/kafka/3.8.0/kafka_2.13-3.8.0.tgz   
2.Extract it in c: (for windows users)  
3.In folder Kafka: open the windows terminal.  
4.Here are the kafka's commands to:  
        
        
        
        -------------------------------------------------------------------------------------------------   
        1.Start Zookeeper:    
        
        .\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties   
        
        2.Start Kafka server:  
        .\bin\windows\kafka-server-start.bat .\config\server.properties  
        
        3. Create a new topic on kafka server:  
        
        .\bin\windows\kafka-topics.bat --create --topic {topic-name} --bootstrap-server {host}:9092  
        
        4.Describe the topic's details :  
        
         .\bin\windows\kafka-topics.bat --create --topic {topic-name} --bootstrap-server {host}:9092  
        
        5.To list all topics that exist inside the broker:  
        
        .\bin\windows\kafka-topics.bat --list --bootstrap-server {host}:9092  
        
        6.Start a terminal to display the topic's messages:  
        
        .\bin\windows\kafka-console-consumer.bat --topic {nombreTopic} --bootstrap-server {host}:9092  
        
        7. Start a terminal to send messages to specific topic:  
        
        .\bin\windows\kafka-console-producer.bat --broker-list {host}:9092 --topic {topic-name}  
        --------------------------------------------------------------------------------------------------  

  
5.Execute the consumer project.  
6.Execute the provider project.  
7.Display the message in terminal of the consumer.    

Enjoy with Kafka
and Spring Boot!!!!!!!
   🙂

