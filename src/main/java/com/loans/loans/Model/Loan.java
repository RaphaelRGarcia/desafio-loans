package com.loans.loans.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Loan {
    private String type;
    private int interest_rate;
}
