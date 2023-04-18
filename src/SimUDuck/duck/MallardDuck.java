package SimUDuck.duck;

import SimUDuck.fly.FlyWithWings;
import SimUDuck.quack.Squeak;

public class MallardDuck extends Duck {
    public MallardDuck() {
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("I'm a Mallard duck!");
    }
}
