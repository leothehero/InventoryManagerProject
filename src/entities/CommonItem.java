package entities;

import java.security.InvalidParameterException;

public class CommonItem { //Rename to CommonItemContainer? It might be a better descriptor.
	String name;
	int capacity;
	int quantity;
	
	public CommonItem(String name, int capacity) {
		this.name = name;
		this.capacity = capacity;
		this.quantity = capacity; // Quantity is initialized to its capacity; indicating that the Item is full upon creation. Set capacity to 0 and use expandCapacity() if you wish to create an empty container.
	}
	
	public void extendCapacity(int extraCapacity) throws InvalidParameterException {
		capacity+=extraCapacity;
	}
	
	
	
	public int getQuantity() {
		return quantity;
	}
	
	public boolean addItems(int change) throws InvalidParameterException { //Must be >0. Throws error if change<0, returns False if not enough space in capacity.
		if (change<1) {
			throw new InvalidParameterException("The Change parameter must not be negative or zero.");
		}
		if (capacity-quantity>=change) {
			quantity+=change;
			return true;
		}
		else {
			return false;
		}
		
	}

}
