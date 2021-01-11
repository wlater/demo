package com.example.demo.controller;

import com.example.demo.UserDTO;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/local")
public class PreservationController {

    @GetMapping("/{RapMeta}")
    public ResponseEntity<?> retriveData(@PathVariable("RapMeta")  String RapMeta) {
        UserDTO user = new UserDTO();
        user.setCpf("12345678910");
        user.setName("blabla");

        return ResponseEntity.ok(user);
    }

}