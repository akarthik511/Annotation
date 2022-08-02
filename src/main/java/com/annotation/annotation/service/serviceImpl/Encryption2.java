package com.annotation.annotation.service.serviceImpl;

import com.annotation.annotation.service.Encryption;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("Encryption2")
public class Encryption2 implements Encryption {

    @Override
    public String getName() {
        return "Encryption2";
    }
}
