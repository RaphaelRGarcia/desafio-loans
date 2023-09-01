package com.loans.loans.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loans.loans.Model.Loan;
import com.loans.loans.Model.Offers;
import com.loans.loans.domain.User.Costumer;

@Service
public class OffersServices {
    
    @Autowired
    CostumerServices costumerServices;

    public Offers createOffer(Costumer costumer,Loan loan){

    }
}
