package structural.composite.validators;

import structural.composite.entities.User;

import java.time.LocalDate;
import java.util.List;

public class BirthInTheFutureValidator  implements  Validator {

    private final User user;

    public BirthInTheFutureValidator(User user) {
        this.user = user;
    }

    @Override
    public List<Validator> getNodes() {
        return null;
    }

    @Override
    public void validate() {
        if(user.getBirth().isAfter(LocalDate.now()))
          throw new RuntimeException("Birth is in the future");
    }
}
