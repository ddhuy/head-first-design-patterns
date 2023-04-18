class FlyBehavior:
    def fly(self):
        pass


class FlyWithWings(FlyBehavior):
    def fly(self):
        print("I'm flying!")


class FlyNoWay(FlyBehavior):
    def fly(self):
        print("I can't fly!")


class FlyRocketPowered(FlyBehavior):
    def fly(self):
        print("I am flying with a rocket!")
