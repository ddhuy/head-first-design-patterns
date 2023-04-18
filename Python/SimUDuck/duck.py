from SimUDuck.fly import FlyWithWings
from SimUDuck.quack import Quack


class Duck:
    def __init__(self):
        self.flyBehavior = None
        self.quackBehavior = None

    def performFly(self):
        self.flyBehavior.fly()

    def performQuack(self):
        self.quackBehavior.quack()

    def display(self):
        pass


class MallardDuck(Duck):
    def __init__(self):
        super(MallardDuck, self).__init__()
        self.flyBehavior = FlyWithWings()
        self.quackBehavior = Quack()

    def display(self):
        print("I'm a mallard duck")
