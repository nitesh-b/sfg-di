package com.niteshb.sfgdi.services;

import com.niteshb.sfgdi.repositories.EnglishGreetingRepoImpl;

public class GreetingFactory {
    public GreetingService getGreeting(String lang){
        switch (lang){
            case "EN":
                return new I18EnglishGreetingService(new EnglishGreetingRepoImpl());
            case "ES":
            default:
                return new I18SpanishGreetingService();

        }
    }

}
