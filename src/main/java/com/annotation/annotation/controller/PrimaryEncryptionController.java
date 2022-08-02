package com.annotation.annotation.controller;

import com.annotation.annotation.service.Encryption;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/get-primary")
public class PrimaryEncryptionController {

    private final Encryption encryption;

    @Autowired
    public PrimaryEncryptionController(Encryption encryption) {
        this.encryption = encryption;
    }

    @GetMapping
    public String getName(){
        return encryption.getName();
    }
}
