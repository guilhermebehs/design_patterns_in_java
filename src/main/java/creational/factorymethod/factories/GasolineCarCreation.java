package creational.factorymethod.factories;

import creational.factorymethod.entities.Car;
import creational.factorymethod.entities.GasolineCar;

public class GasolineCarCreation extends CarCreationFactoryMethod {
    
    @Override
    public Car createEmptyCar() {
        return new GasolineCar();
    }
}
