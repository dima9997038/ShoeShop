package com.example.shoeshop.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private Long id;
    private String category;
    private String description;
    private String manufacturer;
    private double price;
    private double size;

}
