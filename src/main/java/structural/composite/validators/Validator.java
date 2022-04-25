package structural.composite.validators;


import java.util.List;

public interface Validator {
    List<Validator> getNodes();
    void validate();
}
