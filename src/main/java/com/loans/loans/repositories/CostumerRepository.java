package com.loans.loans.repositories;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.loans.loans.domain.User.Costumer;
import java.util.List;


public interface CostumerRepository extends JpaRepository<Costumer,UUID>{
    
    Optional<Costumer> findCostumerByCpf(String cpf);

    List<Costumer> getAllCostumers();
}
