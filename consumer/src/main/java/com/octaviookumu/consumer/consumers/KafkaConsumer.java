package com.octaviookumu.consumer.consumers;

import com.octaviookumu.consumer.domain.RiderLocation;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

    @KafkaListener(topics = "my-topic", groupId = "my-new-group")
    public void listen(String message) {
        System.out.println("Received message: " + message);
    }

    @KafkaListener(topics = "my-topic-new", groupId = "my-new-group-rider")
    public void listenRiderLocation(RiderLocation riderLocation) {
        System.out.println("Received location: " + riderLocation.getRiderId() +
                " : " + riderLocation.getLatitude() +
                " : " + riderLocation.getLongitude()
        );
    }

}
