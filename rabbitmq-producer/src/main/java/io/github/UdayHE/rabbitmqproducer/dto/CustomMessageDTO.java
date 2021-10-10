package io.github.UdayHE.rabbitmqproducer.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CustomMessageDTO {
    private String messageId;
    private String message;
    private Date messageDate;
}
