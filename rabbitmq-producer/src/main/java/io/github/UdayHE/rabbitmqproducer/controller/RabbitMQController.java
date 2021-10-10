package io.github.UdayHE.rabbitmqproducer.controller;


import io.github.UdayHE.rabbitmqproducer.config.RabbitMQConfig;
import io.github.UdayHE.rabbitmqproducer.dto.CustomMessageDTO;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.UUID;

@RestController
public class RabbitMQController {

    @Autowired
    RabbitTemplate template;

    @PostMapping("/publish")
    public String publish(@RequestBody CustomMessageDTO message) {
        message.setMessageId(UUID.randomUUID().toString());
        message.setMessageDate(new Date());
        template.convertAndSend(RabbitMQConfig.TOPIC, RabbitMQConfig.ROUTING_KEY, message);
        return "Message Published";
    }
}
