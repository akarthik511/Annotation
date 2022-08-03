package com.annotation.annotation.entity;

import com.annotation.annotation.annotation.EmailValidation;
import lombok.Data;

@Data
public class Email {

    @EmailValidation
    private String emailId;
}
