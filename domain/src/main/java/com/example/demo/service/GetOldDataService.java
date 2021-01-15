package com.example.demo.service;

import com.example.demo.error.GlobalExeptionHandler;

import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

public interface GetOldDataService {
    HttpStatus getAll() throws GlobalExeptionHandler;
    HttpStatus getOneByCpf( String cpf ) throws GlobalExeptionHandler;
    
}
