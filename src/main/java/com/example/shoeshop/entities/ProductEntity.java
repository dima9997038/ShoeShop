package com.example.shoeshop.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="products")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "category")
    private String category;
    @Column(name = "description", columnDefinition = "text")
    private String description;
    @Column(name = "manufacturer")
    private String manufacturer;
    @Column(name = "price")
    private double price;
    @Column(name = "size")
    private double size;
}
