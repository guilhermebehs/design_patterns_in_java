package structural.composite.validators;

import structural.composite.entities.User;

import java.util.List;

public class NameLengthValidator implements  Validator{

    private final User user;
    private final int minLength;
    private final int maxLength;

    public NameLengthValidator(User user, int minLength, int maxLength){
        this.user = user;
        this.minLength = minLength;
        this.maxLength = maxLength;
    }

    @Override
    public List<Validator> getNodes() {
        return null;
    }

    @Override
    public void validate() {
        if(user.getName().length() < minLength || user.getName().length() > maxLength)
          throw new RuntimeException("Invalid Name length");
    }
}
