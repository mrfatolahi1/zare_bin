package com.myproject.listeners;

import com.myproject.controllers.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Listener {
    @Autowired
    private Controller controller;
    @KafkaListener(topics = "topic1", groupId = "Group1")
    public void listen(String url) {
//        System.out.println("R:      " + url);
        controller.receive(url);
    }
}
