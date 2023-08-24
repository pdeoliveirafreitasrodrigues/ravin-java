package br.com.devxlabs.ravin.controllers.interfaces;

import java.util.List;

import models.entities.Employee;

public interface EmployeeControllerInterface extends ControllerInterface<Employee> {
	
	public List<Employee> listAvailableWaiters();

}
