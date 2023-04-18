from duck import MallardDuck, ModelDuck
from fly import FlyRocketPowered

if __name__ == '__main__':
    mallard = MallardDuck()
    mallard.perform_quack()
    mallard.perform_fly()

    model = ModelDuck()
    model.perform_fly()
    model.set_fly_behavior(FlyRocketPowered())
    model.perform_fly()

    model2 = ModelDuck()
    model2.perform_fly()

    model.perform_fly()

    print(ModelDuck._fly_behavior)
    print(model._fly_behavior)
    print(model2._fly_behavior)
