package br.com.devxlabs.ravin.controllers;

import br.com.devxlabs.ravin.services.ProductService;
import models.dtos.ProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/products")
public class ProductController {

    @Autowired
    ProductService service;

    @GetMapping
    public List<ProductDTO> listAll(){
        return service.listAll();
    }



}
