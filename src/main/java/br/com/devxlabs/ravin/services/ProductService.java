package br.com.devxlabs.ravin.services;

import models.dtos.ProductDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    public List<ProductDTO> listAll(){

        return List.of(new ProductDTO());
    }

}
