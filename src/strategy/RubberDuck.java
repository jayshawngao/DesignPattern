package strategy;

public class RubberDuck extends Duck {
	@Override
	void display() {
		//¿´ÆğÀ´ÏñÏğÆ¤Ñ¼
	}
	public RubberDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Squeek();
	}
}
