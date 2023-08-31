package com.loans.loans.domain.User;


import java.math.BigDecimal;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name="costumer")
@Table(name="costumer")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of="id")

public class Costumer {
    @Id
    @GeneratedValue
    private UUID id;

    private int age;

    private String cpf;

    private String name;
    
    private BigDecimal income;

    private String location;
}