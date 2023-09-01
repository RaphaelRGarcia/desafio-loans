package com.loans.loans.DTOs;

import java.math.BigDecimal;

public record CostumerDTO(int age,String cpf,String name,BigDecimal income,String location) {   
}
