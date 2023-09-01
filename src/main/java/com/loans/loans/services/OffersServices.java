package com.loans.loans.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loans.loans.Model.Loan;
import com.loans.loans.Model.Offers;

@Service
public class OffersServices {
    
    @Autowired
    CostumerServices costumerServices;

    public Offers createOffer(String costumer,List<Loan> loans){
        Offers newOffer = new Offers(costumer,loans);
        return newOffer;
    }
}
