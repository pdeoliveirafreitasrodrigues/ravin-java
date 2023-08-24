package br.com.devxlabs.ravin.controllers.interfaces;

import models.entities.OrderDetail;

public interface OrderControllerInterface extends ControllerInterface<OrderDetail> {
	
	public void addProductQuantity(int quantity);
	public void checkOrderStatus(int orderId);

}
