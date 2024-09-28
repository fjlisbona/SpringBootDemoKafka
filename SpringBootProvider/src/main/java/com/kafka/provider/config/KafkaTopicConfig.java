package com.kafka.provider.config;

import java.util.*;

import org.apache.kafka.clients.admin.NewTopic;
import org.apache.kafka.common.config.TopicConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    
    @Bean
    public NewTopic topic1() {
        
        Map<String, String> configs = new HashMap<>();
        configs.put(TopicConfig.CLEANUP_POLICY_DELETE, TopicConfig.CLEANUP_POLICY_DELETE); //delete(borra el mensaje) compact(mantiene el más actualizado)
        configs.put(TopicConfig.RETENTION_MS_CONFIG, "10000000"); //10 minutos.Tiempo de retencion de mensajes en el topic.
        configs.put(TopicConfig.SEGMENT_BYTES_CONFIG, "10000000"); //10mb. Tamaño max de segmento de archivo de log.
        configs.put(TopicConfig.SEGMENT_MS_CONFIG, "10000000"); //10 minutos. Tiempo de retencion de segmento de archivo de log.
        configs.put(TopicConfig.RETENTION_MS_CONFIG, "10000000"); //10 minutos. Tiempo de retencion de mensajes en el topic.
        configs.put(TopicConfig.RETENTION_BYTES_CONFIG, "10000000"); //10mb. Tamaño max de retencion de mensajes en el topic.
        configs.put(TopicConfig.MAX_MESSAGE_BYTES_CONFIG, "10000000"); //10mb. Tamaño max de mensaje en el topic.
        configs.put(TopicConfig.MAX_COMPACTION_LAG_MS_CONFIG, "10000000"); //10 minutos. Tiempo max de compaction de mensajes en el topic.
        configs.put(TopicConfig.MAX_MESSAGE_BYTES_CONFIG, "10000000"); //10mb. Tamaño max de mensaje en el topic.
        
        return TopicBuilder.name("topic1")
        .partitions(2)//Number of partitions
        .replicas(1)//Number of replicas en otros nodos o clusters de kafka.
        .build();
    }
}
