package br.com.devxlabs.ravin.repositories;

import br.com.devxlabs.ravin.models.entities.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    Optional<Product> findByName(String name);
    Optional<Product> findByCostPrice(double costPrice);
    @Query("SELECT p FROM Product p WHERE p.costPrice <= :costPrice AND p.salePrice >= :salePrice")
    List<Product> findProductsCostPriceGreatherThan(@Param("costPrice") double costPrice, @Param("salePrice") double salePrice);
//    Ou dá pra fazer
//    List<Product> findProductsCostPriceGreatherThan(double costPrice, double salePrice);

    @Query("select p.name FROM Product p")
    List<String> findProductNames();

    @Query(value = "SELECT name FROM Product WHERE productType = :productType AND createdDate = TODAY()", nativeQuery = true)
    List<String> findByProductNameByProductTypeInsertedToday(String productType);

    @Override
    Page<Product> findAll(Pageable pageable);
}
