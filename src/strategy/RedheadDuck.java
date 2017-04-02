package strategy;

public class RedheadDuck extends Duck {
	@Override
	void display() {
		//看起来像红头鸭
	}
	public RedheadDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}
}
