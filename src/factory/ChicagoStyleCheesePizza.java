package factory;

public class ChicagoStyleCheesePizza extends Pizza {
	public ChicagoStyleCheesePizza() {
		setName("ChicagoStyleCheesePizza");
	}
	
	@Override
	void box() {
		// TODO Auto-generated method stub
		super.box();
		System.out.println("ChicagoStyleCheesePizza is OK!");
	}
}
