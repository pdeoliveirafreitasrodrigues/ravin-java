package br.com.devxlabs.ravin.controllers.interfaces;

import models.entities.Tab;
import models.entities.Employee;
import models.entities.Table;

public interface TableControllerInterface extends ControllerInterface<Table> {
	
	public void bookTable() throws Exception;
	public void clearTable() throws Exception;
	public void occupyTable() throws Exception;
	public void allocateEmployee(Employee employee);
	public void addCommanda(Tab tab);

}
