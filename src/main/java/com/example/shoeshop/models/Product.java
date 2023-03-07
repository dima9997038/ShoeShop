package com.example.shoeshop.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
    private Long id;
    private String category;
    private String description;
    private String manufacturer;
    private int price;
    private double size;

}
