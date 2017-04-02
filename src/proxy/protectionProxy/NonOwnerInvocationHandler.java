package proxy.protectionProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class NonOwnerInvocationHandler implements InvocationHandler {
	PersonBean person;
	
	public NonOwnerInvocationHandler(PersonBean person) {
		this.person = person;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) {
		try {
			if(method.getName().startsWith("get")){
				return method.invoke(person, args);
			}else if(method.getName().equals("setHotOrNotRating")){
				return method.invoke(person, args);
			}else if(method.getName().startsWith("set")){
				throw new IllegalAccessException();
			}
		} catch (Exception e) {
			System.out.println("不可以修改别人的信息!");
		}
		return null;
	}

}
