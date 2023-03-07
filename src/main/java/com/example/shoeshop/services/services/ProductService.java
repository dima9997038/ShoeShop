package com.example.shoeshop.services.services;
import com.example.shoeshop.models.Product;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ProductService {
    List<Product> listProducts(String category);
    void saveProduct(Product product);
    void deleteProduct(Long id);
    Product getProductById(Long id);


}
