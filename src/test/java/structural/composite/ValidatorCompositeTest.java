package structural.composite;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import structural.composite.entities.User;
import structural.composite.validators.*;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("ValidatorComposite")
public class ValidatorCompositeTest {


    private ValidatorComposite validatorComposite;
    private User user;
    private List<Validator> innerValidators;
    private Validator userValidator;


    @BeforeEach
    public void setUp(){
        validatorComposite = new ValidatorComposite();

    }


@Test
@DisplayName("Should not throw when user is valid")
public void shouldNotThrowWhenUserIsValid(){

    user = new User()
            .setName("Guilherme Behs")
            .setBirth(LocalDate.now().minusYears(30));

    innerValidators = List.of(
            new NotNullNameValidator(user),
            new NameLengthValidator(user,1, 30),
            new NotNullBirthValidator(user),
            new BirthInTheFutureValidator(user)
    );

    userValidator = new UserValidator(innerValidators);

   assertDoesNotThrow(()-> validatorComposite.validate(userValidator));

}

    @Test
    @DisplayName("Should throw when user name is null")
    public void shouldThrowWhenUserNameIsNull(){
        user = new User()
                .setBirth(LocalDate.now().minusYears(30));

        innerValidators = List.of(
                new NotNullNameValidator(user),
                new NameLengthValidator(user,1, 30),
                new NotNullBirthValidator(user),
                new BirthInTheFutureValidator(user)
        );

        userValidator = new UserValidator(innerValidators);

        var exception = assertThrows(RuntimeException.class,()->
                     validatorComposite.validate(userValidator));

        assertEquals(exception.getMessage(), "Name is null");

    }

    @Test
    @DisplayName("Should throw when user name length is greater than max")
    public void shouldThrowWhenUserNameIsGreaterThanMax(){

        user = new User()
              .setName("Guilherme Behs")
              .setBirth(LocalDate.now().minusYears(30));

        innerValidators = List.of(
                new NotNullNameValidator(user),
                new NameLengthValidator(user,1, 10),
                new NotNullBirthValidator(user),
                new BirthInTheFutureValidator(user)
        );

        userValidator = new UserValidator(innerValidators);

        var exception = assertThrows(RuntimeException.class,()->
                validatorComposite.validate(userValidator));

        assertEquals(exception.getMessage(), "Invalid Name length");

    }

    @Test
    @DisplayName("Should throw when user name length is smaller than min")
    public void shouldThrowWhenUserNameIsSmallerThanMin(){

        user = new User()
                .setName("")
                .setBirth(LocalDate.now().minusYears(30));

        innerValidators = List.of(
                new NotNullNameValidator(user),
                new NameLengthValidator(user,1, 30),
                new NotNullBirthValidator(user),
                new BirthInTheFutureValidator(user)
        );

        userValidator = new UserValidator(innerValidators);

        var exception = assertThrows(RuntimeException.class,()->
                validatorComposite.validate(userValidator));

        assertEquals(exception.getMessage(), "Invalid Name length");

    }


    @Test
    @DisplayName("Should throw when user birth is null")
    public void shouldThrowWhenUserBirthIsNull(){
        user = new User()
                .setName("Guilherme Behs");

        innerValidators = List.of(
                new NotNullNameValidator(user),
                new NameLengthValidator(user,1, 30),
                new NotNullBirthValidator(user),
                new BirthInTheFutureValidator(user)
        );

        userValidator = new UserValidator(innerValidators);

        var exception = assertThrows(RuntimeException.class,()->
                validatorComposite.validate(userValidator));

        assertEquals(exception.getMessage(), "Birth is null");

    }

    @Test
    @DisplayName("Should throw when user birth is in the future")
    public void shouldThrowWhenUserBirthIsInTheFuture(){
        user = new User()
                .setName("Guilherme Behs")
                .setBirth(LocalDate.now().plusYears(1));

        innerValidators = List.of(
                new NotNullNameValidator(user),
                new NameLengthValidator(user,1, 30),
                new NotNullBirthValidator(user),
                new BirthInTheFutureValidator(user)
        );

        userValidator = new UserValidator(innerValidators);

        var exception = assertThrows(RuntimeException.class,()->
                validatorComposite.validate(userValidator));

        assertEquals(exception.getMessage(), "Birth is in the future");

    }


}
