package composite;

import java.util.Iterator;

public class MenuItem extends MenuComponet {
	String name;
	String description;
	double price;
	boolean isVegetarion;
	public MenuItem(String name, String description, double price, boolean isVegetarion) {
		this.name = name;
		this.description = description;
		this.price = price;
		this.isVegetarion = isVegetarion;
	}
	@Override
	String getName() {
		return name;
	}
	
	@Override
	String getDescription() {
		return description;
	}
	
	@Override
	double getPrice() {
		return price;
	}
	
	@Override
	boolean isVegetarion() {
		return isVegetarion;
	}
	
	@Override
	void print() {
		System.out.print(" "+getName());
		if(isVegetarion()){
			System.out.print("(V)");
		}
		System.out.println(", "+getPrice());
		System.out.println("     ---"+getDescription());
	}
	
	@Override
	Iterator<MenuComponet> createIterator() {
		return new NullIterator<MenuComponet>();
	}
	
	
}
