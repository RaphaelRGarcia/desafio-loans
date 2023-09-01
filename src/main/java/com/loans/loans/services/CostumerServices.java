package com.loans.loans.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loans.loans.DTOs.CostumerDTO;
import com.loans.loans.domain.User.Costumer;
import com.loans.loans.repositories.CostumerRepository;

@Service
public class CostumerServices {
    
    @Autowired
    CostumerRepository repository;

    public List<Costumer> getAllCostumers(){
        return this.repository.findAll();
    }

    public Costumer findCostumerByCpf(String cpf) throws Exception{
        return this.repository.findCostumerByCpf(cpf).orElseThrow(()->new Exception("Costumer not found"));
    }

    public void saveCostumer(Costumer costumer){
        this.repository.save(costumer);
    }

    public Costumer createCostumer(CostumerDTO data) throws Exception{
        Costumer newCostumer = new Costumer(data);
        this.saveCostumer(newCostumer);
        return newCostumer;
    }


}
