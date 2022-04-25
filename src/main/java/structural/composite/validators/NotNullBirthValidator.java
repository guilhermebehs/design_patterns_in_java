package structural.composite.validators;

import structural.composite.entities.User;

import java.util.List;

public class NotNullBirthValidator implements  Validator {

    private final User user;

    public NotNullBirthValidator(User user) {
        this.user = user;
    }

    @Override
    public List<Validator> getNodes() {
        return null;
    }

    @Override
    public void validate() {
        if(user.getBirth() == null)
            throw new RuntimeException("Birth is null");
    }
}
