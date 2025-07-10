package com.nttdata.ms_produtos.service;

import com.nttdata.ms_produtos.dto.ProductRequest;
import com.nttdata.ms_produtos.dto.ProductResponse;

import java.util.List;

public interface IProductService {

    ProductResponse createProduct(ProductRequest productRequest);

    List<ProductResponse> listAllProducts();

    ProductResponse getProductById(Long id);
}
