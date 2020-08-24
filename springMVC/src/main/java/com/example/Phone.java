package com.example;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = MobileValidator.class)
@Target( { ElementType.FIELD } )
@Retention(RetentionPolicy.RUNTIME)
public @interface Phone {

        public String message() default "{Phone.mobileNo}";

        public Class<?>[] groups() default {};

        public Class<? extends Payload>[] payload() default {};
}

