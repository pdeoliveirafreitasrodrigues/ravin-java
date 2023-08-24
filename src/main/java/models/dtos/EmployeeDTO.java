package models.dtos;

import br.com.devxlabs.ravin.enums.EmployeeAviability;
import br.com.devxlabs.ravin.enums.MeritalStatus;
import br.com.devxlabs.ravin.enums.Responsibility;
import br.com.devxlabs.ravin.enums.Schooling;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

public class EmployeeDTO implements Serializable {

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

    //Employee
    @NotBlank(message = "O campo RG não pode estar em branco")
    @NotEmpty(message = "O campo RG não pode estar vazio")
    private String rg;

    @NotEmpty(message = "O campo Estado Civil não pode estar vazio")
    private MeritalStatus meritalStatus;
    @NotEmpty(message = "O campo escolaridade não pode estar vazio")
    private Schooling schooling;

    @NotEmpty(message = "O campo cargo não pode estar vazio")
    private Responsibility responsability;

    private int pis;

    @NotBlank(message = "O campo data de admissão não pode estar em branco")
    @NotEmpty(message = "O campo data de admissão não pode estar vazio")
    private Date admissionDate;
    private Date resignationDate;

    @NotEmpty(message = "O campo disponibilidade de funcionário não pode estar vazio")
    private EmployeeAviability employeeAviability;

}
