package com.loans.loans.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loans.loans.DTOs.CostumerDTO;
import com.loans.loans.Model.Offers;
import com.loans.loans.services.CostumerServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/costumer-loans")
public class CostumerLoansController {
    
    @Autowired
    CostumerServices costumerServices;

    @PostMapping
    public ResponseEntity<Offers> postMethodName(@RequestBody CostumerDTO data) {
        //Função em progresso
        return new ResponseEntity<>(new Offers(),HttpStatus.OK);
    }
    
}
