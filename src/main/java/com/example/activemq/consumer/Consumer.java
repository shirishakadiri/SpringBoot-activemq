package com.example.activemq.consumer;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

@Component
public class Consumer {

    @JmsListener(destination = "sample.queue")
    public void listener(@PathVariable("message") final String message){
        System.out.println("Received message: " + message);
    }
}
