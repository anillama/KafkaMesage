package com.example.kafkaexample;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;
//rest controller
@RestController
@RequestMapping("api/v1/messages")
public class MessageController {
    //top comment..
    //hello
    private KafkaTemplate<String, String> kafkaTemplate;
    //added a comment here..
    public MessageController(KafkaTemplate<String, String> kafkaTemplate)
    {
        this.kafkaTemplate = kafkaTemplate;
    }
    @GetMapping("/all/{request}")
    public void publish(@PathVariable("request") String request)
    {
        kafkaTemplate.send("amigoscode", request);
    }

}