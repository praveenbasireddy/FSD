package com.fsd.learning.example.bookStoreKafkaProject;

import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookStoreKafkaProjectImplementation {

    @Autowired
    KafkaProducerConfig kafkaProducer;

    @RequestMapping("/sendData")
    public String sendData(){
        return kafkaProducer.sendMessage("Hi!!");
    }
}
