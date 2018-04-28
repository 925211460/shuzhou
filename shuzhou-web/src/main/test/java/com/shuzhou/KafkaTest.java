package com.shuzhou;

import org.apache.kafka.clients.admin.*;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by lufei on 18/4/28.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class KafkaTest {
    @Autowired
    private AdminClient adminClient;
    @Autowired
    private KafkaProducer producer;
    @Autowired
    private KafkaConsumer consumer;
    
    @Test
    public void testKafkaAdmin(){
        try {
            List list = new ArrayList<>();
            NewTopic topic = new NewTopic("test2",1,(short) 1);
            list.add(topic);
            CreateTopicsResult topics = adminClient.createTopics(list);
        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test
    public void testProducer(){
        try {
            for (int i = 100; i < 200; i++)
                producer.send(new ProducerRecord<String, String>("test2", Integer.toString(i), Integer.toString(i)));
        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @Test
    public void testConsumer(){
        consumer.subscribe(Arrays.asList("test2"));
        while (true){
            ConsumerRecords<String, String> records = consumer.poll(100);
            for (ConsumerRecord<String, String> record : records) {
                System.out.printf("offset = %d, key = %s, value = %s%n", record.offset(), record.key(), record.value());
            }
        }
    }


}
