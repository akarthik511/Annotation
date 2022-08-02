package com.annotation.annotation.service.serviceImpl;

import com.annotation.annotation.service.Encryption;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
@Qualifier("Encryption1")
public class Encryption1 implements Encryption {

    @Override
    public String getName() {
        return "Encryption1";
    }
}
