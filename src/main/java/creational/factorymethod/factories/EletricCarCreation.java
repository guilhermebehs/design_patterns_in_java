package creational.factorymethod.factories;

import creational.factorymethod.entities.Car;
import creational.factorymethod.entities.EletricCar;

public class EletricCarCreation extends CarCreationFactoryMethod {

    @Override
    public Car createEmptyCar() {
        return new EletricCar();
    }
}
