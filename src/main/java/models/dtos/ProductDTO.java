package models.dtos;

import br.com.devxlabs.ravin.enums.ProductType;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;

import java.io.Serial;
import java.io.Serializable;

public class ProductDTO implements Serializable {

    //UTILS
    public static final String MIN_COST_PRICE = "0.0";
    public static final String MIN_SALE_PRICE = "0.0";


    @Serial
    private static final long serialVersionUID = 1L;

    private Long id;

    @NotBlank(message = "O campo nome não pode estar em branco")
    @NotEmpty(message = "O campo nome não pode ser vazio")
    private String name;

    @NotBlank(message = "O campo descrição não pode estar em branco")
    @NotEmpty(message = "O campo descrição não pode ser vazio")
    private String description;

    @NotBlank(message = "O campo código não pode estar em branco")
    @NotEmpty(message = "O campo código não pode ser vazio")
    private String code;

    private @DecimalMin(value = MIN_COST_PRICE, message = "O preço de custo não pode ser negativo") Double costPrice;

    private @DecimalMin(value = MIN_SALE_PRICE, message = "O preço de venda não pode ser negativo") Double salePrice;

    @NotBlank(message = "O campo tempo de preparação não pode estar em branco")
    @NotEmpty(message = "O campo tempo de preparação não pode ser vazio")
    private String preparationTime;

    private ProductType productType;

    private Boolean hasActive = true;


    public ProductDTO() {
    }

    public ProductDTO(Long id, String name, String description, String code, double costPrice, double salePrice, String preparationTime, ProductType productType, boolean hasActive) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.code = code;
        this.costPrice = costPrice;
        this.salePrice = salePrice;
        this.preparationTime = preparationTime;
        this.productType = productType;
        this.hasActive = hasActive;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public @DecimalMin(value = MIN_COST_PRICE, message = "O preço de custo não pode ser negativo") Double getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(@DecimalMin(value = MIN_COST_PRICE, message = "O preço de custo não pode ser negativo") Double costPrice) {
        this.costPrice = costPrice;
    }

    public @DecimalMin(value = MIN_SALE_PRICE, message = "O preço de venda não pode ser negativo") Double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(@DecimalMin(value = MIN_SALE_PRICE, message = "O preço de venda não pode ser negativo") Double salePrice) {
        this.salePrice = salePrice;
    }

    public String getPreparationTime() {
        return preparationTime;
    }

    public void setPreparationTime(String preparationTime) {
        this.preparationTime = preparationTime;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public Boolean isHasActive() {
        return hasActive;
    }

    public void setHasActive(Boolean hasActive) {
        this.hasActive = hasActive;
    }
}
