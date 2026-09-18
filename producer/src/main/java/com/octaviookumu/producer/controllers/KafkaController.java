package com.octaviookumu.producer.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class KafkaController {

    private final KafkaTemplate<String, String> kafkaTemplate;

    /**
     * Does the job of producing messages
     *
     * @param message is the message sent
     * @return the message sent
     */
    @PostMapping("/send")
    public String sendMessage(@RequestParam String message) {
        kafkaTemplate.send("my-topic", message);
        return "Message Sent: " + message;
    }
}
