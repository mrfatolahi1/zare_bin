package com.myproject;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Listener {
    @KafkaListener(topics = "topic1", groupId = "Group1")
    public void listen(String message) {
        System.out.println("Received Message: " + message);
    }
}
