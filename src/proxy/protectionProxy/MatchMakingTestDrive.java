package proxy.protectionProxy;

import java.lang.reflect.Proxy;

public class MatchMakingTestDrive {
	static PersonBean getOwnerProxy(PersonBean person){
		return (PersonBean) Proxy.newProxyInstance(person.getClass().getClassLoader(), person.getClass().getInterfaces(), new OwnerInvocationHandler(person)); 
	}
	static PersonBean getNonOwnerProxy(PersonBean person){
		return (PersonBean) Proxy.newProxyInstance(person.getClass().getClassLoader(), person.getClass().getInterfaces(), new NonOwnerInvocationHandler(person));
	}
	
	public static void main(String[] args) {
		PersonBean joe = new PersonBeanImpl("joe", "man", "music, movie", 0);
		PersonBean ownerProxy = getOwnerProxy(joe);
		PersonBean nonOwnerProxy = getNonOwnerProxy(joe);
		ownerProxy.setHotOrNotRating(2);
		System.out.println(ownerProxy.getGendar());
		nonOwnerProxy.setGendar("woman");
		System.out.println(nonOwnerProxy.getGendar());
	}
}
