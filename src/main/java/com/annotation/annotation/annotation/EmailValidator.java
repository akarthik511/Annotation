package com.annotation.annotation.annotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class EmailValidator implements ConstraintValidator<EmailValidation, String> {
    @Override
    public void initialize(EmailValidation constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        return s!=null &&  s.matches("^[a-zA-Z0-9+_.-]+@nineleaps.com");
    }
}
