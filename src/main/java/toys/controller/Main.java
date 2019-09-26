package toys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import toys.entity.Enum.Sex;
import toys.entity.Enum.Size;
import toys.entity.Person;
import toys.entity.User;
import toys.validator.DemoValidator;


import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/**
 * Created by Michail on 8/9/2019.
 */
public class Main {
    private static Validator validator;
    static {
        ValidatorFactory validatorFactory=Validation.buildDefaultValidatorFactory();
        validator=validatorFactory.getValidator();
    }
StringBuilder stringBuilder=new StringBuilder("ertytr");

    public static void main(String[] args) {
        StringBuilder stringBuilder=new StringBuilder("ertytr");

        testValidators(new User("test","","",""));

    }
    public static void testValidators(User user) {
        final User person = user;

        Set<ConstraintViolation<User>> validates = validator.validate(person);
        Assert.hasText(person.getShippindAddress());
        validates.stream().map(v -> v.getMessage())
                .forEach(System.out::println);




    }
}
