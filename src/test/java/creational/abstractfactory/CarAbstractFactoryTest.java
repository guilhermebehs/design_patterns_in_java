package creational.abstractfactory;

import creational.abstractfactory.factories.EletricCarFactory;
import creational.abstractfactory.factories.GasolineCarFactory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("CarAbstractFactory")
public class CarAbstractFactoryTest {

    private CarAbstractFactory carFactory;

    @Test
    @DisplayName("Should create a gasoline car")
    public void shouldCreateAGasolineCar(){
        carFactory = new GasolineCarFactory();
        var car = carFactory.createCar();
        var carClass = car.getClass();
        assertEquals(carClass.getSimpleName(), "GasolineCar");

    }

    @Test
    @DisplayName("Should create an eletric car")
    public void shouldCreateAnEletricCar(){
        carFactory = new EletricCarFactory();
        var car = carFactory.createCar();
        var carClass = car.getClass();
        assertEquals(carClass.getSimpleName(), "EletricCar");

    }
}