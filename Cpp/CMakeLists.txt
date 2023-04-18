cmake_minimum_required(VERSION 3.25)
project(Cpp)

set(CMAKE_CXX_STANDARD 17)

add_executable(Cpp SimUDuck/main.cpp SimUDuck/duck/Duck.cpp SimUDuck/duck/Duck.h SimUDuck/fly/FlyBehavior.cpp SimUDuck/fly/FlyBehavior.h SimUDuck/quack/QuackBehavior.cpp SimUDuck/quack/QuackBehavior.h SimUDuck/duck/MallardDuck.cpp SimUDuck/duck/MallardDuck.h SimUDuck/duck/RubberDuck.cpp SimUDuck/duck/RubberDuck.h SimUDuck/duck/DecoyDuck.cpp SimUDuck/duck/DecoyDuck.h SimUDuck/duck/ModelDuck.cpp SimUDuck/duck/ModelDuck.h SimUDuck/fly/FlyWithWings.cpp SimUDuck/fly/FlyWithWings.h SimUDuck/fly/FlyNoWay.cpp SimUDuck/fly/FlyNoWay.h SimUDuck/fly/FlyRocketPowered.cpp SimUDuck/fly/FlyRocketPowered.h SimUDuck/quack/Quack.cpp SimUDuck/quack/Quack.h SimUDuck/quack/Squeak.cpp SimUDuck/quack/Squeak.h SimUDuck/quack/MuteQuack.cpp SimUDuck/quack/MuteQuack.h)
