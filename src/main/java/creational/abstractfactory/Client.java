
package creational.abstractfactory;

import creational.abstractfactory.factories.EletricCarFactory;
import creational.abstractfactory.factories.GasolineCarFactory;

public class Client {

    private static CarAbstractFactory carAbstractFactory;

    public static void main(String[] args) {

         configure(args);
         carAbstractFactory.createCar();
    }


    private static void configure(String[] args){
        if(args.length > 0 && args[0] != null) {
            var carType = args[0];
            if(carType.equalsIgnoreCase("eletric"))
                carAbstractFactory = new EletricCarFactory();
            else
                carAbstractFactory = new GasolineCarFactory();
        }
        else
            carAbstractFactory = new GasolineCarFactory();

    }
}
