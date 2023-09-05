package br.com.devxlabs.ravin.models.dtos;

import br.com.devxlabs.ravin.enums.TabStatus;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import br.com.devxlabs.ravin.models.entities.Table;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

public class TabDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    private int id;
    private Table table;
    private CustomerDTO customerDTO;
    private List<OrderDetailDTO> orderDetailsDTO;

    // @Column(unique = true,nullable = false) ---> PERGUNTAR SOBRE O UNIQUE
    @NotBlank(message = "O campo código não pode estar em branco")
    @NotEmpty(message = "O campo código não pode ser vazio")
    private String code;

    private String comments; // PERGUNTAR SE VAI TER
    @NotEmpty(message = "O campo Status da Comanda não pode estar vazio")
    private TabStatus tabStatus;

    public TabDTO() {
    }

    public TabDTO(int id, Table table, CustomerDTO customerDTO, List<OrderDetailDTO> orderDetailsDTO, String code, String comments, TabStatus tabStatus) {
        this.id = id;
        this.table = table;
        this.customerDTO = customerDTO;
        this.orderDetailsDTO = orderDetailsDTO;
        this.code = code;
        this.comments = comments;
        this.tabStatus = tabStatus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
    }

    public CustomerDTO getCustomerDTO() {
        return customerDTO;
    }

    public void setCustomerDTO(CustomerDTO customerDTO) {
        this.customerDTO = customerDTO;
    }

    public List<OrderDetailDTO> getOrderDetailsDTO() {
        return orderDetailsDTO;
    }

    public void setOrderDetailsDTO(List<OrderDetailDTO> orderDetailsDTO) {
        this.orderDetailsDTO = orderDetailsDTO;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public TabStatus getTabStatus() {
        return tabStatus;
    }

    public void setTabStatus(TabStatus tabStatus) {
        this.tabStatus = tabStatus;
    }
}
