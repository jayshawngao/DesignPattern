package composite;

import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator<MenuComponet> {
	
	public static Stack<Iterator<MenuComponet>> stack = new Stack<Iterator<MenuComponet>>();
	
	public CompositeIterator(Iterator<MenuComponet> iterator) {
		stack.push(iterator);
	}
	
	@Override
	public boolean hasNext() {
		if(stack.empty()){
			return false;
		}else{
			Iterator<MenuComponet> iterator = stack.peek();
			if(!iterator.hasNext()){
				stack.pop();
				return hasNext();
			}else{
				return true;
			}
		}
	}

	@Override
	public MenuComponet next() {
		if(hasNext()){
			Iterator<MenuComponet> iterator = stack.peek();
			MenuComponet componet = iterator.next();
			if(componet instanceof Menu){
				stack.push(componet.createIterator());
			}
			return componet;
		}else{
			return null;
		}
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}
}
