package com.loans.loans.services;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loans.loans.Model.Loan;
import com.loans.loans.domain.User.Costumer;

@Service
public class LoanServices {
    
    @Autowired
    CostumerServices costumerServices;

    public List<Loan> createLoanList(Costumer costumer){
        List<Loan> loanList = new ArrayList<>();
        if (costumer.getIncome().compareTo(BigDecimal.valueOf(3000.00)) <=0 || 
        (costumer.getIncome().compareTo(BigDecimal.valueOf(3000.00))<=0 && 
        costumer.getIncome().compareTo(BigDecimal.valueOf(5000.00))>=1 && 
        costumer.getAge()<30 && 
        costumer.getLocation()=="SP")) {
            Loan loan = this.createLoan("PERSONAL",4);
            loanList.add(loan);
        }
        if (costumer.getIncome().compareTo(BigDecimal.valueOf(5000.00)) >=0) {
            Loan loan = this.createLoan("CONSIGNMENT",2);
            loanList.add(loan);
        }
        if (costumer.getIncome().compareTo(BigDecimal.valueOf(3000.00)) <=0 ||
         (costumer.getIncome().compareTo(BigDecimal.valueOf(3000.00))<=0 && 
        costumer.getIncome().compareTo(BigDecimal.valueOf(5000.00))>=1 && 
        costumer.getAge()<30 && 
        costumer.getLocation()=="SP") ){
            Loan loan = this.createLoan("GUARANTEED",3);
            loanList.add(loan);
        }
        return loanList;
    }

    public Loan createLoan(String type,int interest_rate){
        Loan newLoan = new Loan(type, interest_rate);
        return newLoan;
    }
}
