package com.example.demo.controller;

import com.example.demo.error.GlobalExeptionHandler;
import com.example.demo.service.GetOldDataService;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersistController {
    @Autowired
    private GetOldDataService getOldDataService;

    @RabbitListener(queues = "getAll_legacy_request")
    public void getAllOldData( String message ) throws GlobalExeptionHandler {
        getOldDataService.getAll();
    }

    @RabbitListener(queues = "getOne_legacy_request")
    public void getOneOldData( String cpf ) throws GlobalExeptionHandler {
        getOldDataService.getOneByCpf(cpf);
    }
    
}
