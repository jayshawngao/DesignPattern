package adapter;

import java.util.Enumeration;
import java.util.Iterator;
/**
 * 
* @ClassName: EnumerationIterator
* @Description: 该适配器完成了从Enumeration到Iterator的适配工作
* @author Jayshawn
* @date 2017年3月27日 下午11:15:53
* 
* @param <E>
 */
public class EnumerationIterator<E> implements Iterator<E> {
	Enumeration<E> enumeration;
	
	public EnumerationIterator(Enumeration<E> enumeration) {
		this.enumeration = enumeration;
	}
	
	@Override
	public boolean hasNext() {
		return enumeration.hasMoreElements();
	}

	@Override
	public E next() {
		return enumeration.nextElement();
	}

}
