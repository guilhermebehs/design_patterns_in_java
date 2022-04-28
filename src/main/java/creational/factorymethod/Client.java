
package creational.factorymethod;

import creational.factorymethod.factories.CarCreationFactoryMethod;
import creational.factorymethod.factories.EletricCarCreation;
import creational.factorymethod.factories.GasolineCarCreation;

public class Client {

    private static CarCreationFactoryMethod carCreation;

    public static void main(String[] args) {

         configure(args);
         carCreation.createEmptyCar();
    }


    private static void configure(String[] args){
        if(args.length > 0 && args[0] != null) {
            var carType = args[0];
            if(carType.equalsIgnoreCase("eletric"))
                carCreation = new EletricCarCreation();
            else
                carCreation = new GasolineCarCreation();
        }
        else
            carCreation = new GasolineCarCreation();

    }
}
