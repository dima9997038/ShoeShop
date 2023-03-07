package com.example.shoeshop.services.services.impl;

import com.example.shoeshop.models.Product;
import com.example.shoeshop.services.services.ProductService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductServiceImpl implements ProductService {
    private final List<Product> products=new ArrayList<>();
    private long ID=0;
    {
        products.add(new Product(++ID,"Детская","Удобные кожанные сандали","Bambino",45, 17));
        products.add(new Product(++ID,"Спортивная","Белые тенисные туфли","Puma",180, 26));
    }

    @Override
    public List<Product> listProducts() {
        return products;
    }
    @Override
    public void saveProduct(Product product){
        product.setId(++ID);
        products.add(product);
    }
    @Override
    public void deleteProduct(Long id){
        products.removeIf(product -> product.getId().equals(id));
    }
    @Override
    public Product getProductById(Long id) {
        for (Product product:products){
            if(product.getId().equals(id)) return product;
        }
        return null;
    }
}
