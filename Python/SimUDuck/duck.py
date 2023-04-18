from fly import FlyWithWings, FlyNoWay
from quack import Quack, MuteQuack, Squeak


class Duck:
    _fly_behavior = None
    _quack_behavior = None

    def set_fly_behavior(self, fly_behavior):
        self._fly_behavior = fly_behavior

    def set_quack_behavior(self, quack_behavior):
        self._quack_behavior = quack_behavior

    def perform_fly(self):
        self._fly_behavior.fly()

    def perform_quack(self):
        self._quack_behavior.quack()

    def swim(self):
        print("All ducks float, even decoys!")

    def display(self):
        raise NotImplementedError


class MallardDuck(Duck):
    _fly_behavior = FlyWithWings()
    _quack_behavior = Quack()

    def display(self):
        print("I'm a mallard duck")


class DecoyDuck(Duck):
    _fly_behavior = FlyNoWay()
    _quack_behavior = MuteQuack()

    def display(self):
        print("I'm a Decoy duck")


class RubberDuck(Duck):
    _fly_behavior = FlyNoWay()
    _quack_behavior = Squeak()

    def display(self):
        print("I'm a Rubber duck")


class ModelDuck(Duck):
    _fly_behavior = FlyNoWay()
    _quack_behavior = Quack()

    def display(self):
        print("I'm a Model duck")