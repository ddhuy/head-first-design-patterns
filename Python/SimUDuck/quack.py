class QuackBehavior:
    def quack(self):
        raise NotImplementedError


class Quack(QuackBehavior):
    def quack(self):
        print("Quack Quack!")


class Squeak(QuackBehavior):
    def quack(self):
        print("Squeak Squeak")


class MuteQuack(QuackBehavior):
    def quack(self):
        print("<<Mute quack>>")
