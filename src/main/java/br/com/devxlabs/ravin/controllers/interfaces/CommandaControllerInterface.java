package br.com.devxlabs.ravin.controllers.interfaces;

import models.entities.Tab;
import models.entities.OrderDetail;
import br.com.devxlabs.ravin.enums.TabStatus;

public interface CommandaControllerInterface extends ControllerInterface<Tab> {
	
	public void addOrder(OrderDetail orderDetail) throws Exception;
	public void removeOrder(OrderDetail pedido) throws Exception;
	public void closeCommanda() throws Exception;
	public void listCommandasByStatus(TabStatus status);
	public double calculateTotalCommandaValue();

}
