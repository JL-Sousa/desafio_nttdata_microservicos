package com.nttdata.ms_produtos.dto;

import com.nttdata.ms_produtos.entity.Product;

public record ProductResponse(Long id, String name, String description, Double price) {

    public static ProductResponse fromProduct(Product product) {
        return new ProductResponse(
                product.getId(),
                product.getName(),
                product.getDescription(),
                product.getPrice()
        );
    }
}
