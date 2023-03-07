package com.example.shoeshop.transformers;

import com.example.shoeshop.entities.ProductEntity;
import com.example.shoeshop.models.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductEntityToProductTransformer implements Transform<Product, ProductEntity> {
    @Override
    public Product transform(ProductEntity objectFrom) {
        Product product=new Product();
        product.setId(objectFrom.getId());
        product.setCategory(objectFrom.getCategory());
        product.setDescription(objectFrom.getDescription());
        product.setManufacturer(objectFrom.getManufacturer());
        product.setPrice(objectFrom.getPrice());
        product.setSize(objectFrom.getSize());
        return product;
    }
}
