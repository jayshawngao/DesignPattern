package factory;

import java.util.ArrayList;

public abstract class Pizza {
	String name;
	String dough;
	String sauce;
	ArrayList toppings = new ArrayList();
	
	void prepare(){
		System.out.println("Preparing "+name);
		System.out.println("Tossing dough...");
		System.out.println("Adding sauce...");
		System.out.println("Adding toppings: ");
		for(int i=0;i<toppings.size();i++){
			System.out.println(" "+toppings.get(i));
		}
	}
	void bake(){
		System.out.println("Bake...");
	}
	void cut(){
		System.out.println("Cut...");
	}
	void box(){
		System.out.println("Box...");
	}
	public String getName(){
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
