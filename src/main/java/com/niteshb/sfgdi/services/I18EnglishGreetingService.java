package com.niteshb.sfgdi.services;

import com.niteshb.sfgdi.repositories.EnglishGreetingRepo;


public class I18EnglishGreetingService implements GreetingService {

    private final EnglishGreetingRepo englishGreetingRepo;

    public I18EnglishGreetingService(EnglishGreetingRepo englishGreetingRepo) {
        this.englishGreetingRepo = englishGreetingRepo;
    }

    @Override
    public String sayGreeting() {
        return "Hello World - EN";
    }
}
