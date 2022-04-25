package structural.composite.validators;

import structural.composite.entities.User;

import java.util.List;

public class NotNullNameValidator implements Validator{

    private final User user;

    public NotNullNameValidator(User user){
        this.user = user;
    }


    @Override
    public List<Validator> getNodes() {
        return null;
    }

    @Override
    public void validate() {
           if(user.getName() == null)
               throw new RuntimeException("Name is null");
    }
}
