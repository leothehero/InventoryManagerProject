package controllers;

import entities.Inventory;
import entities.User;

public class InventoryManager {
	Inventory inventory;
	
	public InventoryManager() {
		this.inventory = new Inventory();
	}
	public User createUser(String name) {
		
		return new User.createUser(name);
	}

}
