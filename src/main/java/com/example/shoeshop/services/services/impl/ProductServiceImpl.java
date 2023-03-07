package com.example.shoeshop.services.services.impl;

import com.example.shoeshop.entities.ProductEntity;
import com.example.shoeshop.models.Product;
import com.example.shoeshop.repositories.ProductRepository;
import com.example.shoeshop.services.services.ProductService;
import com.example.shoeshop.transformers.ProductEntityToProductTransformer;
import com.example.shoeshop.transformers.ProductToProductEntityTransformer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@Slf4j
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;
    private final ProductEntityToProductTransformer productEntityToProductTransformer;
    private final ProductToProductEntityTransformer productToProductEntityTransformer;

    public ProductServiceImpl(ProductRepository productRepository, ProductEntityToProductTransformer productEntityToEntityTransformer, ProductToProductEntityTransformer productToProductEntityTransformer) {
        this.productRepository = productRepository;
        this.productEntityToProductTransformer = productEntityToEntityTransformer;
        this.productToProductEntityTransformer = productToProductEntityTransformer;
    }

    @Override
    public List<Product> listProducts(String category) {
        if (category != null) {
            return productRepository.findByCategory(category)
                    .stream()
                    .map(productEntityToProductTransformer::transform)
                    .collect(Collectors.toList());
        }
        return productRepository
                .findAll()
                .stream()
                .map(productEntityToProductTransformer::transform)
                .collect(Collectors.toList());
    }

    @Override
    public void saveProduct(Product product) {
        log.info("Saving new" + product);
        productRepository.save(productToProductEntityTransformer.transform(product));
    }

    @Override
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }

    @Override
    public Product getProductById(Long id) {
        ProductEntity entity = productRepository.findById(id).orElse(null);
        if (entity != null) {
            return productEntityToProductTransformer.transform(entity);
        }
        throw new IllegalArgumentException("No product with id " + id);
    }
}
