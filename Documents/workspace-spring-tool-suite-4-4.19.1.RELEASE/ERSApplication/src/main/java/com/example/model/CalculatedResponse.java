package com.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CalculatedResponse {

    @Id
    private int Sum;
    private int Sub;
    private int Mul;
    private int Div;
}
