package com.shuzhou.config;

import com.shuzhou.Properties.KafkaProperties;
import org.apache.kafka.clients.admin.AdminClient;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

/**
 * Created by lufei on 18/4/28.
 */

@Configuration
@EnableConfigurationProperties(KafkaProperties.class)
public class KafkaConfig {

    @Autowired
    private KafkaProperties kafkaProperties;

    @Bean
    public AdminClient adminClient(){
        Properties properties = new Properties();
        properties.put("bootstrap.servers",kafkaProperties.getBootstrapServers());
        return AdminClient.create(properties);
    }

    @Bean
    public KafkaProducer kafkaProducer(){
        Properties props = new Properties();
        props.put("bootstrap.servers", kafkaProperties.getBootstrapServers());
        props.put("acks", kafkaProperties.getAcks());
        props.put("retries", kafkaProperties.getRetries());
        props.put("batch.size", kafkaProperties.getBatchSize());
        props.put("linger.ms", kafkaProperties.getLingerMs());
        props.put("buffer.memory", kafkaProperties.getBufferMemory());
        props.put("key.serializer", kafkaProperties.getKeySerializer());
        props.put("value.serializer", kafkaProperties.getValueSerializer());
        KafkaProducer<String, String> producer = new KafkaProducer<>(props);
        return producer;
    }

    @Bean
    public KafkaConsumer kafkaConsumer(){
        Properties props = new Properties();
        props.put("bootstrap.servers", kafkaProperties.getBootstrapServers());
        props.put("group.id", kafkaProperties.getGroupId());
        props.put("enable.auto.commit", kafkaProperties.getEnableAutoCommit());
        props.put("auto.commit.interval.ms", kafkaProperties.getAutoCommitIntervalMs());
        props.put("key.deserializer", kafkaProperties.getKeyDeserializer());
        props.put("value.deserializer", kafkaProperties.getValueDeserializer());
        KafkaConsumer<String, String> consumer = new KafkaConsumer<>(props);
        return consumer;
    }
}
