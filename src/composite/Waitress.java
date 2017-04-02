package composite;

import java.util.Iterator;

public class Waitress {
	MenuComponet allMenus;
	public Waitress(MenuComponet allMenus)  {
		this.allMenus = allMenus;
	}
	public void printMenu(){
		allMenus.print();
	}
	
	public void printVegerianMenu(){
		Iterator<MenuComponet> iterator = allMenus.createIterator();
		Iterator<MenuComponet> compositeIterator = new CompositeIterator(iterator);
		System.out.println("\nVEGETARIAN MENU\n-------");
		while(compositeIterator.hasNext()){
			MenuComponet menuComponet = compositeIterator.next();
			try {
				if(menuComponet.isVegetarion()){
					menuComponet.print();
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
