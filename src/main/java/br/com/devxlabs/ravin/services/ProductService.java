package br.com.devxlabs.ravin.services;

import models.dtos.ProductDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.sql.SQLOutput;
import java.util.List;

@Service
public class ProductService {

    public List<ProductDTO> listAll(){

        return List.of(new ProductDTO(), new ProductDTO());
    }

    public ProductDTO findById(long id){
        System.out.print(id);
        return new ProductDTO();
    }

    public void deleteById(Long id){
        System.out.println("Deletou o produto " + id);
    }

}
