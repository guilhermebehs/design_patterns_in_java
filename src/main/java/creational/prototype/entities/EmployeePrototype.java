package creational.prototype.entities;

public abstract class EmployeePrototype {

    private String name;
    private String legalDocumentNumber;
    private String sector;
    private Double salary;

    public EmployeePrototype(){}

    public EmployeePrototype(EmployeePrototype employee){
        if(employee != null) {
            this.sector = employee.getSector();
            this.salary = employee.getSalary();
        }
    }

    public abstract EmployeePrototype clone();

    public String getName() {
        return name;
    }

    public EmployeePrototype setName(String name) {
        this.name = name;
        return this;
    }

    public String getLegalDocumentNumber() {
        return legalDocumentNumber;
    }

    public EmployeePrototype setLegalDocumentNumber(String legalDocumentNumber) {
        this.legalDocumentNumber = legalDocumentNumber;
        return this;
    }

    public String getSector() {
        return sector;
    }

    public EmployeePrototype setSector(String sector) {
        this.sector = sector;
        return this;
    }

    public Double getSalary() {
        return salary;
    }

    public EmployeePrototype setSalary(Double salary) {
        this.salary = salary;
        return this;
    }

    @Override
    public String toString() {
        return "EmployeePrototype{" +
                "name='" + name + '\'' +
                ", legalDocumentNumber='" + legalDocumentNumber + '\'' +
                ", sector='" + sector + '\'' +
                ", salary=" + salary +
                '}';
    }
}
