package io.github.UdayHE.rabbitmqconsumer.listener;


import io.github.UdayHE.rabbitmqconsumer.config.RabbitMQConfig;
import io.github.UdayHE.rabbitmqconsumer.dto.CustomMessageDTO;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class RabbitMQListener {


    @RabbitListener(queues = RabbitMQConfig.QUEUE)
    public void listener(CustomMessageDTO message) {
        System.out.println(message);
    }
}
