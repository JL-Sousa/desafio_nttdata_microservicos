package com.nttdata.ms_produtos.service.impl;

import com.nttdata.ms_produtos.dto.ProductRequest;
import com.nttdata.ms_produtos.dto.ProductResponse;
import com.nttdata.ms_produtos.entity.Product;
import com.nttdata.ms_produtos.repository.ProductRepository;
import com.nttdata.ms_produtos.service.IProductService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements IProductService {

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public ProductResponse createProduct(ProductRequest productRequest) {
        Product product = new Product(
                productRequest.name(),
                productRequest.description(),
                productRequest.price()
        );
        Product saved = productRepository.save(product);
        return ProductResponse.fromProduct(saved);
    }

    @Override
    public List<ProductResponse> listAllProducts() {
        return productRepository.findAll()
                .stream()
                .map(ProductResponse::fromProduct)
                .collect(Collectors.toList());
    }

    @Override
    public ProductResponse getProductById(Long id) {
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Produto não encontrado"));
        return ProductResponse.fromProduct(product);
    }
}