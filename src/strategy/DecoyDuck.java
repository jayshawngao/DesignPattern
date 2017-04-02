package strategy;

public class DecoyDuck extends Duck {
	@Override
	void display() {
		//¿´ÆğÀ´ÏñÓÕ¶üÑ¼
	}
	public DecoyDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new MuteQuack();
	}
}
