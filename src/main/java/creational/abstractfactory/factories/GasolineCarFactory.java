package creational.abstractfactory.factories;

import creational.abstractfactory.CarAbstractFactory;
import creational.abstractfactory.entities.Car;
import creational.abstractfactory.entities.GasolineCar;

public class GasolineCarFactory implements CarAbstractFactory {
    
    @Override
    public Car createCar() {
        return new GasolineCar();
    }
}
