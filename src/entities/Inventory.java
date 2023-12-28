package entities;

public class Inventory {
	CommonItem[] itemLot;
	UniqueItem[] uniqueItemLot;
	String name;
	String locationDescription; // A managed inventory block can correspond to a specific inventory area in the real world. In this case, each inventory can have a name and location description to allow the real world user to find it.
	
	public Inventory(String name, String locationDescription) {
		this.name = name;
		this.locationDescription = locationDescription;
		itemLot = new CommonItem[8];
		uniqueItemLot = new UniqueItem[8];
	}
	
	public void AddCommonItem(CommonItem item) {
		
	}
}
