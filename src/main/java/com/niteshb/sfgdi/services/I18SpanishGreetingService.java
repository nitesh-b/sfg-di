package com.niteshb.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;


public class I18SpanishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Ola Mundo - ES";
    }
}
