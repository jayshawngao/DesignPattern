package factory;

public class NYStylePizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String type) {
		if(type.equals("cheese"))
			return new NYStyleCheesePizza();
		if(type.equals("veggie"))
			return new NYStyleVeggiePizza();
		return null;
	}

}
