package com.example.shoeshop.transformers;

import com.example.shoeshop.entities.ProductEntity;
import com.example.shoeshop.models.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductToProductEntityTransformer implements Transform<ProductEntity,Product>{

    @Override
    public ProductEntity transform(Product objectFrom) {
        ProductEntity entity=new ProductEntity();
        entity.setId(objectFrom.getId());
        entity.setCategory(objectFrom.getCategory());
        entity.setDescription(objectFrom.getDescription());
        entity.setManufacturer(objectFrom.getManufacturer());
        entity.setPrice(objectFrom.getPrice());
        entity.setSize(objectFrom.getSize());
        return entity;
    }
}
