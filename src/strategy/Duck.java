package strategy;

public class Duck {
	protected FlyBehavior flyBehavior;
	protected QuackBehavior quackBehavior;
	void swim(){}
	void display(){}
	void performQuack(){quackBehavior.quack();}
	void performFly(){flyBehavior.fly();}
	void setFlyBehavior(FlyBehavior flyBehavior){this.flyBehavior = flyBehavior;}
	void setQuackBehavior(QuackBehavior quackBehavior){this.quackBehavior = quackBehavior;}
}
