package com.example.demo.service.config;

import org.springframework.amqp.core.*;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MessagingConfig {
    public static final String QUEUE_GETALL = "bank_getall";
    public static final String QUEUE_GETONE = "bank_getone";
    public static final String EXCHANGE = "bank_auth_exchange";
    public static final String ROUTING_GETALL = "bank_getall";
    public static final String ROUTING_GETONE = "bank_getone";

    @Bean
    public Queue queueGetAll() { return new Queue(QUEUE_GETALL); }

    @Bean
    public Queue queueGetOne() { return new Queue(QUEUE_GETONE); }


    @Bean
    public TopicExchange exchange() {
        return new TopicExchange(EXCHANGE);
    }

    @Bean
    public Binding bindingGetAll(Queue queue, TopicExchange exchange) {
        return BindingBuilder.bind(queue).to(exchange).with(ROUTING_GETALL);
    }

    @Bean
    public Binding bindingGetOne(Queue queue, TopicExchange exchange) {
        return BindingBuilder.bind(queue).to(exchange).with(ROUTING_GETONE);
    }

    @Bean
    public MessageConverter converter() {
        return new Jackson2JsonMessageConverter();
    }

    @Bean
    public AmqpTemplate template(ConnectionFactory connectionFactory) {
        final RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory);
        rabbitTemplate.setMessageConverter(converter());
        return rabbitTemplate;
    }
    
}
