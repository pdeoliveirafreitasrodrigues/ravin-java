package br.com.devxlabs.ravin.controllers;

import br.com.devxlabs.ravin.services.ProductService;
import jakarta.validation.Valid;
import br.com.devxlabs.ravin.models.dtos.ProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<ProductDTO> findById(@PathVariable Long id){
        ProductDTO productDTO = service.findById(id);
        if (productDTO == null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.ok(productDTO);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteById(@PathVariable Long id){
        service.deleteById(id);
    }

    @GetMapping(value = "/search")
    public List<ProductDTO> search(@RequestParam(value = "name") String name,
                                   @RequestParam(value = "productType") String productType,
                                   @RequestParam(value = "minSalePrice") double minsalePrice,
                                   @RequestParam(value = "maxSalePrice") double maxSalePrice,
                                   @RequestParam(value = "page", defaultValue = "0", required = false) Integer page,
                                   @RequestParam(value = "orderBy", defaultValue = "id", required = false) String orderBy,
                                   @RequestParam(value = "itensPerPage", defaultValue = "10", required = false) Integer itensPerPage,
                                   @RequestParam(value = "direction", defaultValue = "ASC", required = false) String direction){

        return  service.search(name, productType, minsalePrice, maxSalePrice,
                page, orderBy, itensPerPage, direction);
    }

    @PostMapping
    public void create(@Valid @RequestBody ProductDTO productDTO){
        System.out.println(productDTO.toString());
    }

    @PutMapping(value = "/{id}")
    public void update(@Valid @RequestBody ProductDTO productDTO, @PathVariable Integer id){
        System.out.println(productDTO);
    }

/*    @PostMapping()
    public ProductDTO createProduct(@RequestBody @Valid ProductDTO productDTO){
      return service.createProduct(productDTO);
    }*/



}
