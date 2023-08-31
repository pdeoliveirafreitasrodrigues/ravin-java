package br.com.devxlabs.ravin.services;

import br.com.devxlabs.ravin.repositories.ProductRepository;
import models.dtos.ProductDTO;
import models.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public List<ProductDTO> listAll(){

        return List.of(new ProductDTO());
    }

    public ProductDTO findById(long id){
        Optional<Product> optional = productRepository.findById(id);
        productRepository.count()
        return
    }

    public void deleteById(Long id){
        System.out.println("Deletou o produto " + id);
    }

    public List<ProductDTO> search (String name, String productType, double minSalePrice, double maxSalePrice){
        System.out.println("Buscando o produto com Filtros: ");
        return List.of(new ProductDTO(), new ProductDTO(), new ProductDTO());
    }

}
