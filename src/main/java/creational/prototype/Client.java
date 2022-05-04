package creational.prototype;

import creational.prototype.entities.EmployeePrototype;
import creational.prototype.entities.HourlyEmployee;

public class Client {

    private static EmployeePrototype employee;

    public static void main(String[] args) {

        configure();
        var newEmployee = employee.clone();
        System.out.println(newEmployee);
    }


    private static void configure(){
        employee = new HourlyEmployee()
                .setName("Guilherme Behs")
                .setLegalDocumentNumber("12345")
                .setSalary(10000.00)
                .setSector("It Department");

    }
}
