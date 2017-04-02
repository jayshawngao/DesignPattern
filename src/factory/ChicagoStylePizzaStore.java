package factory;

public class ChicagoStylePizzaStore extends PizzaStore {

	public ChicagoStylePizzaStore() {
		
	}
	@Override
	protected Pizza createPizza(String type) {
		if(type.equals("cheese"))
			return new ChicagoStyleCheesePizza();
		if(type.equals("veggie"))
			return new ChicagoStyleVeggiePizza();
		return null;
	}

}
