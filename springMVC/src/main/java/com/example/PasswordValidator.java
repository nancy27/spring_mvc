package com.example;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordValidator implements ConstraintValidator<IsValidPassword,String> {

    @Override
    public void initialize(IsValidPassword isValidPassword) {

    }

    @Override
    public boolean isValid(String password, ConstraintValidatorContext context) {

        return (password.equalsIgnoreCase("USA"));
        /*
        if (password.equalsIgnoreCase("USA")){
            return true;
        }
        else {
            return false;
        }

         */
    }
}
