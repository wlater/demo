package com.example.demo.database;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

import com.example.demo.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface SybaseRepository extends JpaRepository<User, Long> {
    Optional<User> findByCpf( String cpf );
}
