package com.example.demo.service;

import com.example.demo.error.GlobalExeptionHandler;

import org.springframework.http.HttpStatus;

public interface GetOldDataService {
    HttpStatus getAll() throws GlobalExeptionHandler;
    HttpStatus getOneByCpf( String cpf ) throws GlobalExeptionHandler;
    
}
