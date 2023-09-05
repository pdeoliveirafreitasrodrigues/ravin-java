package br.com.devxlabs.ravin.models.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

public class CustomerDTO implements Serializable {

    //Person
    @Serial
    private static final long serialVersionUID = 1L;

    private int id;

    @NotBlank(message = "O campo nome não pode estar em branco")
    @NotEmpty(message = "O campo nome não pode ser vazio")
    private String name;

    private String phone;

    @NotBlank(message = "O campo CPF não pode estar em branco")
    @NotEmpty(message = "O campo CPF não pode ser vazio")
    private String cpf;

    private Date dateOfBirth;
    private String observations;
    private boolean hasActive = true;

    //Address
    private AddressDTO addressDTO;

    //Customer
    private String allergies;
    private boolean vip;


    public CustomerDTO() {
    }

    public CustomerDTO(int id, String name, String phone, String cpf, Date dateOfBirth, String observations, boolean hasActive, AddressDTO addressDTO, String allergies, boolean vip) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.cpf = cpf;
        this.dateOfBirth = dateOfBirth;
        this.observations = observations;
        this.hasActive = hasActive;
        this.addressDTO = addressDTO;
        this.allergies = allergies;
        this.vip = vip;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }

    public boolean isHasActive() {
        return hasActive;
    }

    public void setHasActive(boolean hasActive) {
        this.hasActive = hasActive;
    }

    public AddressDTO getAddressDTO() {
        return addressDTO;
    }

    public void setAddressDTO(AddressDTO addressDTO) {
        this.addressDTO = addressDTO;
    }

    public String getAllergies() {
        return allergies;
    }

    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }
}
