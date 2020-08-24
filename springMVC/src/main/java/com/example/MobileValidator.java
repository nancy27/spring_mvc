package com.example;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.lang.annotation.Annotation;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileValidator implements ConstraintValidator<Phone,String> {
    Pattern pattern = Pattern.compile("^\\d{10}$");

    @Override
    public void initialize(Phone constraintAnnotation) {

    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value == null) {
        return false;
        }

        if(value.length() == 10  ) {
            return true;
        }
        else {
            return false;
        }
    }
}
