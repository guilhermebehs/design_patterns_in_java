
package structural.composite;

import structural.composite.entities.User;
import structural.composite.validators.*;

import java.time.LocalDate;
import java.util.List;

public class Client {

    private static ValidatorComposite validatorComposite;
    private static Validator userValidator;

    public static void main(String[] args) {

         configure();
        validatorComposite.validate(userValidator);
    }


    private static void configure(){
        var user = new User()
                .setName("Guilherme Behs")
                .setBirth(LocalDate.now().minusYears(30));

        validatorComposite = new ValidatorComposite();

        userValidator = new UserValidator(List.of(
                new NotNullBirthValidator(user),
                new BirthInTheFutureValidator(user),
                new NotNullNameValidator(user),
                new NameLengthValidator(user, 1, 30)
        ));


    }
}
