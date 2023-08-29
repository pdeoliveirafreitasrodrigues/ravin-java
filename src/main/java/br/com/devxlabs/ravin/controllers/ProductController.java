package br.com.devxlabs.ravin.controllers;

import br.com.devxlabs.ravin.services.ProductService;
import models.dtos.ProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping(value = "/{id}")
    public ProductDTO findById(@PathVariable Long id){
        return service.findById(id);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteById(@PathVariable Long id){
        service.deleteById(id);
    }



}
