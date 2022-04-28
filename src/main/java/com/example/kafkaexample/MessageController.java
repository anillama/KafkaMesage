package com.example.kafkaexample;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/messages")
public class MessageController {

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
