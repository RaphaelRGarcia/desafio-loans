package com.loans.loans.Model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Offers {
    private String costumer;
    private List<Loan> loans;
}
