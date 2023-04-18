package SimUDuck;

import SimUDuck.quack.Quack;
import SimUDuck.quack.QuackBehavior;

public class DuckCallDevice {
    QuackBehavior quackBehavior;

    public DuckCallDevice() {
        this.quackBehavior = new Quack();
    }

    public void setQuackBehavior(QuackBehavior qb) {
        this.quackBehavior = qb;
    }

    public void mimicDuckCall() {
        this.quackBehavior.quack();
    }
}
