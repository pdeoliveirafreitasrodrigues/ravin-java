package models.dtos;

import br.com.devxlabs.ravin.enums.PreparationOrderStatus;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;

import java.io.Serial;
import java.io.Serializable;
import java.security.Timestamp;

public class OrderDetailDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    private int id;
    private ProductDTO productDTO;
    private Timestamp requestDateTime;
    private Timestamp startPreparationDateTime;
    private Timestamp reminingPreparationTime;
    @NotEmpty(message = "O campo Status de Preparo não pode estar vazio")
    private PreparationOrderStatus preparationOrderStatus;
    private String comments;
    @NotBlank(message = "O campo quantidade não pode estar em branco")
    @NotEmpty(message = "O campo quantidade não pode ser vazio")
    private int quantity;


    public OrderDetailDTO() {
    }

    public OrderDetailDTO(int id, ProductDTO productDTO, Timestamp requestDateTime, Timestamp startPreparationDateTime, Timestamp reminingPreparationTime, PreparationOrderStatus preparationOrderStatus, String comments, int quantity) {
        this.id = id;
        this.productDTO = productDTO;
        this.requestDateTime = requestDateTime;
        this.startPreparationDateTime = startPreparationDateTime;
        this.reminingPreparationTime = reminingPreparationTime;
        this.preparationOrderStatus = preparationOrderStatus;
        this.comments = comments;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ProductDTO getProductDTO() {
        return productDTO;
    }

    public void setProductDTO(ProductDTO productDTO) {
        this.productDTO = productDTO;
    }

    public Timestamp getRequestDateTime() {
        return requestDateTime;
    }

    public void setRequestDateTime(Timestamp requestDateTime) {
        this.requestDateTime = requestDateTime;
    }

    public Timestamp getStartPreparationDateTime() {
        return startPreparationDateTime;
    }

    public void setStartPreparationDateTime(Timestamp startPreparationDateTime) {
        this.startPreparationDateTime = startPreparationDateTime;
    }

    public Timestamp getReminingPreparationTime() {
        return reminingPreparationTime;
    }

    public void setReminingPreparationTime(Timestamp reminingPreparationTime) {
        this.reminingPreparationTime = reminingPreparationTime;
    }

    public PreparationOrderStatus getPreparationOrderStatus() {
        return preparationOrderStatus;
    }

    public void setPreparationOrderStatus(PreparationOrderStatus preparationOrderStatus) {
        this.preparationOrderStatus = preparationOrderStatus;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
