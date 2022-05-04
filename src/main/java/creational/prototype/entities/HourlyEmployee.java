package creational.prototype.entities;

public class HourlyEmployee extends EmployeePrototype {

    public HourlyEmployee(){}

    private HourlyEmployee(EmployeePrototype employee) {
        super(employee);
    }

    @Override
    public EmployeePrototype clone() {
        return new HourlyEmployee(this);
    }


}
