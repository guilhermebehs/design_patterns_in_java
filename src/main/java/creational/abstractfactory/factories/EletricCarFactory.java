package creational.abstractfactory.factories;

import creational.abstractfactory.CarAbstractFactory;
import creational.abstractfactory.entities.Car;
import creational.abstractfactory.entities.EletricCar;

public class EletricCarFactory implements CarAbstractFactory {

    @Override
    public Car createCar() {
        return new EletricCar();
    }
}
