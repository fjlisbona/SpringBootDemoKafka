package com.kafka.consumer.SpringBootConsumer.listener;

import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

import ch.qos.logback.classic.Logger;

@Configuration
public class KafkaConsumerListener {
   
    private Logger logger=(Logger) LoggerFactory.getLogger(KafkaConsumerListener.class);
    
    @KafkaListener(topics="example-topic1", groupId="example-group")//Este grupo es para que sepan que es la misma aplicacion,puede haber varios.
    public void listener(String message){
        logger.info("Message received: , the final message is:"+message);
    }






}
