package creational.factorymethod;

import creational.factorymethod.factories.CarCreationFactoryMethod;
import creational.factorymethod.factories.EletricCarCreation;
import creational.factorymethod.factories.GasolineCarCreation;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("CarCreationFactoryMethod")
public class CarCreationFactoryMethodTest {


    private CarCreationFactoryMethod carCreationFactoryMethod;

    @Test
    @DisplayName("Should create a gasoline car")
    public void shouldCreateAGasolineCar(){
        carCreationFactoryMethod = new GasolineCarCreation();
        var car = carCreationFactoryMethod.createEmptyCar();
        var carClass = car.getClass();
        assertEquals(carClass.getSimpleName(), "GasolineCar");

    }

    @Test
    @DisplayName("Should create an eletric car")
    public void shouldCreateAnEletricCar(){
        carCreationFactoryMethod = new EletricCarCreation();
        var car = carCreationFactoryMethod.createEmptyCar();
        var carClass = car.getClass();
        assertEquals(carClass.getSimpleName(), "EletricCar");
    }
}
