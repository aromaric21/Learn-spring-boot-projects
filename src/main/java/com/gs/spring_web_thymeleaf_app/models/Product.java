package com.gs.spring_web_thymeleaf_app.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;

import java.time.Year;

@Entity
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @NotNull(message = "Product type can not be null")
    private ProductType productType;

    @NotBlank(message = "Brand can not be null")
    private String brand;

    @NotBlank(message = "Model type can not be null")
    private String model;

    @NotNull(message = "Price type can not be null")
    @Positive
    private double price;

    @NotNull(message = "Year type can not be null")
    private Year year;


}
