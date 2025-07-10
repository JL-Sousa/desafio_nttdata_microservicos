package com.nttdata.ms_produtos.dto;

public record ProductRequest(String name, String description, Double price) {

    public ProductRequest {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("O nome não pode ser nulo ou estar em branco");
        }
        if (description == null || description.isBlank()) {
            throw new IllegalArgumentException("A descrição não pode ser nula ou em branco");
        }
        if (price == null || price <= 0) {
            throw new IllegalArgumentException("O preço deve ser um número positivo");
        }
    }
}
