package creational.prototype;

import creational.prototype.entities.EmployeePrototype;
import creational.prototype.entities.HourlyEmployee;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@DisplayName("EmployeePrototype")
public class EmployeePrototypeTest {

    private EmployeePrototype currentEmployee;

    @BeforeEach
    public void setUp(){
        currentEmployee = new HourlyEmployee()
                .setName("Guilherme Behs")
                .setLegalDocumentNumber("12345")
                .setSalary(10000.00)
                .setSector("It Department");
    }


@Test
@DisplayName("Should clone current employee")
    public void shouldCloneCurrentEmployee(){
    var newEmployee = currentEmployee.clone();

    assertEquals(newEmployee.getSalary(), currentEmployee.getSalary());
    assertEquals(newEmployee.getSector(), currentEmployee.getSector());
    assertNotEquals(newEmployee, currentEmployee);
    assertNotEquals(newEmployee.getName(), currentEmployee.getName());
    assertNotEquals(newEmployee.getLegalDocumentNumber(), currentEmployee.getLegalDocumentNumber());


    }

}
