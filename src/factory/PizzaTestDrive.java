package factory;

public class PizzaTestDrive {
	public static void main(String[] args) {
		PizzaStore nyStore = new NYStylePizzaStore();
		PizzaStore chicagoStore = new ChicagoStylePizzaStore();
		Pizza pizza = nyStore.orderPizza("cheese");
		Pizza pizza2 = chicagoStore.orderPizza("cheese");
	}
}
