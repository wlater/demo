package com.example.demo.service;

import com.example.demo.database.SybaseRepository;
import com.example.demo.error.GlobalExeptionHandler;
import com.example.demo.service.config.MessagingConfig;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class GetOldDataServiceImpl implements GetOldDataService{

    @Autowired
    private SybaseRepository sybaseRepository;

    @Autowired
    private RabbitTemplate template;

    @Override
    public HttpStatus getAll() throws GlobalExeptionHandler {
        try {
            template.convertAndSend(MessagingConfig.EXCHANGE, MessagingConfig.ROUTING_KEY, "ex");
            return  HttpStatus.OK;
        }catch (Exception e){
            throw new GlobalExeptionHandler("Nenhum usuario foi encontrado.", 204);
        }
    }

    @Override
    public HttpStatus getOneByCpf(String cpf) throws GlobalExeptionHandler {
        try {
            template.convertAndSend(MessagingConfig.EXCHANGE, MessagingConfig.ROUTING_KEY, cpf);
            return  HttpStatus.OK;
        }catch (Exception e){
            throw new GlobalExeptionHandler("Usuario nao existente.", 204);
        }
    }

    
}
