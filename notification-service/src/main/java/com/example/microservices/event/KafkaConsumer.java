package com.example.microservices.event;


import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;

@Slf4j
public class KafkaConsumer {

    @KafkaListener(topics = "notificationTopic")
    public void handleNotification(OrderPlaceEvent orderPlaceEvent) {
        log.info("Received notification for Order", orderPlaceEvent.getOrderNumber());
        //send out an email notification
    }
}