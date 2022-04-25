package structural.composite.validators;

import java.util.List;

public class UserValidator implements Validator {

    private final List<Validator> nodes;

    public UserValidator(List<Validator> nodes){
        this.nodes = nodes;
    }

    @Override
    public List<Validator> getNodes() {
        return nodes;
    }

    @Override
    public void validate() {}
}
