package SimUDuck;

import SimUDuck.duck.Duck;
import SimUDuck.duck.MallardDuck;
import SimUDuck.duck.ModelDuck;
import SimUDuck.fly.FlyRocketPowered;
import SimUDuck.quack.Quack;
import SimUDuck.quack.QuackBehavior;
import SimUDuck.quack.Squeak;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();

        DuckCallDevice dcd = new DuckCallDevice();
        // call mallard duck
        dcd.setQuackBehavior(new Quack());
        dcd.mimicDuckCall();
        // call decoy duck
        dcd.setQuackBehavior(new Squeak());
        dcd.mimicDuckCall();
    }
}
