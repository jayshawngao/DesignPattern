package composite;

import java.util.Iterator;

public abstract class MenuComponet {
	String getName(){
		throw new UnsupportedOperationException();
	}
	String getDescription(){
		throw new UnsupportedOperationException();
	}
	double getPrice(){
		throw new UnsupportedOperationException();
	}
	boolean isVegetarion(){
		throw new UnsupportedOperationException();
	}
	void print(){
		throw new UnsupportedOperationException();
	}
	void add(MenuComponet componet){
		throw new UnsupportedOperationException();
	}
	void remove(MenuComponet componet){
		throw new UnsupportedOperationException();
	}
	MenuComponet getChild(int postion){
		throw new UnsupportedOperationException();
	}
	Iterator<MenuComponet> createIterator(){
		throw new UnsupportedOperationException();
	}
	
}
