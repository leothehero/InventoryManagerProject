package scenario;

import controllers.InventoryManager;
import controllers.ItemController;
import controllers.UserController;

public class TestScenario1 {
	ItemController itemController;
	UserController userController;
	
	
	public static void main(String[] args) {
		InventoryManager inventory = new InventoryManager();
		inventory.createUser("Leo");
		inventory.createUser("Diane");

	}

}
