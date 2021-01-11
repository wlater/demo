package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.*;



//@Data
@NoArgsConstructor
@Accessors(chain = true)
@Entity
@Table(name = "oldUser")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cpf;

    @Embedded
    private Numero termos;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Numero getTermos() {
        return termos;
    }

    public void setTermos(Numero termos) {
        this.termos = termos;
    }
}
