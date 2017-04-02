package composite;

public class MenuLoader {
	public static void main(String[] args) {
		MenuComponet pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
		MenuComponet dinerMenu = new Menu("DINER MENU", "Lunch");
		MenuComponet cafeMenu = new Menu("CAFE MENU", "Dinner");
		MenuComponet dessertMenu = new Menu("DESSERT MENU", "Dessert of course!");
		MenuComponet allMenus = new Menu("ALL MENUS", "All menus combined");
		allMenus.add(pancakeHouseMenu);
		allMenus.add(dinerMenu);
		allMenus.add(cafeMenu);
		dinerMenu.add(new MenuItem("Pasta", "descript the Pasta", 3.89, true));
		dinerMenu.add(dessertMenu);
		dessertMenu.add(new MenuItem("Apple Pie", "Apple Pie wtih flakey crust!", 1.59, true));
		Waitress waitress = new Waitress(allMenus);
//		waitress.printMenu();
		waitress.printVegerianMenu();
	}
}
