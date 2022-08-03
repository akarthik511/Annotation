package com.annotation.annotation.controller;

import com.annotation.annotation.entity.Email;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class EmailController {

    @GetMapping("/email")
    public String email(@Valid @RequestBody Email email){

        Email email1=new Email();
        email1.setEmailId(email.getEmailId());
        return email1.getEmailId();
    }
}
