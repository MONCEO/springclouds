package com.its.springclouds.service;


import com.its.springclouds.client.ProductClientFeign;
import com.its.springclouds.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductClientFeign productClientFeign;
    public List<Product> listProduct(){
        return productClientFeign.listProdcut();

    }
}
