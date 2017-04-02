package strategy;

public class MallardDuck extends Duck {
	@Override
	void display() {
		//看起来像绿头鸭
	}
	public MallardDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}
}
