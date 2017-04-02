package proxy.protectionProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class OwnerInvocationHandler implements InvocationHandler {
	PersonBean person;
	public OwnerInvocationHandler(PersonBean person) {
		this.person = person;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args){
		try {
			if(method.getName().startsWith("get")){
				return method.invoke(person, args);
			}else if(method.getName().equals("setHotOrNotRating")){
				throw new IllegalAccessException();
			}else if(method.getName().startsWith("set")){
				return method.invoke(person, args);
			}
		} catch (Exception e) {
			System.out.println("不可以评价自己!");
		}
		return null;
	}

}
