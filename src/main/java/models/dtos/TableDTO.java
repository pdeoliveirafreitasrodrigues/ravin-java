package models.dtos;

import br.com.devxlabs.ravin.enums.TableStatus;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import models.entities.Employee;
import models.entities.Tab;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

public class TableDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private int id;
    private EmployeeDTO employeeDTO;
    private List<TabDTO> tabDTOList;

    @NotBlank(message = "O campo Nome não pode estar em branco")
    @NotEmpty(message = "O campo Nome não pode ser vazio")
    private String name;
    @NotBlank(message = "O campo código não pode estar em branco")
    @NotEmpty(message = "O campo código não pode ser vazio")
    private String code;
    @NotBlank(message = "O campo número não pode estar em branco")
    @NotEmpty(message = "O campo número não pode ser vazio")
    private int number;
    @NotEmpty(message = "O campo Status Mesa não pode ser vazio")
    private TableStatus tableStatus;


}
