package factory;

public class NYStyleCheesePizza extends Pizza {
	public NYStyleCheesePizza() {
		setName("NYStyleCheesePizza");
	}
	
	@Override
	void box() {
		// TODO Auto-generated method stub
		super.box();
		System.out.println("NYStyleCheesePizza is OK!");
	}
}
