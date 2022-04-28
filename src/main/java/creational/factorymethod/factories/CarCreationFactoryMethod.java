package creational.factorymethod.factories;

import creational.factorymethod.entities.Car;

public abstract class CarCreationFactoryMethod {

    public void putWheels(){}

    public void putSeats(){}

    public void putSteeringWheel(){}

    public abstract Car createEmptyCar();
}
