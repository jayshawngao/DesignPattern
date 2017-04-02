package composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Menu extends MenuComponet {
	List<MenuComponet> menuComponets = new ArrayList<MenuComponet>();
	String name;
	String description;
	public Menu(String name, String decription) {
		this.name = name;
		this.description = decription;
	}
	@Override
	void add(MenuComponet componet) {
		menuComponets.add(componet);
	}
	@Override
	void remove(MenuComponet componet) {
		menuComponets.remove(componet);
	}
	@Override
	MenuComponet getChild(int postion) {
		return menuComponets.get(postion);
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
	void print() {
		System.out.print("\n"+getName());
		System.out.println(", "+getDescription());
		System.out.println("----------------");
		Iterator<MenuComponet> iterator = menuComponets.iterator();
		while(iterator.hasNext()){
			MenuComponet menuComponet = iterator.next();
			menuComponet.print();
		}
	}
	
	@Override
	Iterator<MenuComponet> createIterator() {
		return menuComponets.iterator();
	}
}
