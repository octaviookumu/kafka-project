package com.octaviookumu.producer.controllers;

import com.octaviookumu.producer.domain.RiderLocation;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class KafkaController {

    private final KafkaTemplate<String, RiderLocation> kafkaTemplate;

    /**
     * Does the job of producing messages
     *
     * @param message is the message sent
     * @return the message sent
     */
    @PostMapping("/send")
    public String sendMessage(@RequestParam String message) {
        RiderLocation riderLocation = RiderLocation.builder()
                .riderId("rider123")
                .latitude(28.61)
                .longitude(77.23)
                .build();
        kafkaTemplate.send("my-topic-new", riderLocation);
        return "Message Sent: " + riderLocation.getRiderId();
    }
}
