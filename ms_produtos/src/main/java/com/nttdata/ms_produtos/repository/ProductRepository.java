package com.nttdata.ms_produtos.repository;

import com.nttdata.ms_produtos.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
