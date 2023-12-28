package entities;

import java.util.UUID;

public class User<T extends CommonItem> { // TODO Make User Serialized to save memory. We don't need every user ever to be loaded in memory.
	UUID userID;
	String name;
	UniqueItem[] uniqueItems;
	CommonItem[] commonItems;
	
	public User(String name) {
		this.userID = UUID.randomUUID();
		this.name = name;
		uniqueItems = new UniqueItem[0];
		commonItems = new CommonItem[0];
	}
	
	public void addItem(T item) {
		if (item instanceof UniqueItem) {
			UniqueItem[] newArray = new UniqueItem[uniqueItems.length+1];
			System.arraycopy(uniqueItems, 0, newArray, 0, uniqueItems.length);
			newArray[uniqueItems.length] = (UniqueItem) item;
			uniqueItems = newArray;
		}
	}
	
	public T getItemByID (UUID itemID) {
		for (int i=0;i<uniqueItems.length;i++) {
			if (uniqueItems[i].getID()==itemID) {
				return (T) uniqueItems[i];
			}
		}
		for (int i=0; i<commonItems.length; i++) {
			if (commonItems[i].getID()==itemID) {
				return (T) commonItems[i];
			}
		}
		return null;
	}
}
