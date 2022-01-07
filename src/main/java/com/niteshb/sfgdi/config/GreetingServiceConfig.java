package com.niteshb.sfgdi.config;

import com.niteshb.sfgdi.repositories.EnglishGreetingRepo;
import com.niteshb.sfgdi.repositories.EnglishGreetingRepoImpl;
import com.niteshb.sfgdi.services.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingServiceConfig {

    @Bean
    GreetingFactory greetingFactory(){
        return new GreetingFactory();
    }

    @Bean
    EnglishGreetingRepo englishGreetingRepo(){
        return new EnglishGreetingRepoImpl();
    }


    @Bean
    ConstructorGreetingService constructorGreetingService(){
        return new ConstructorGreetingService();
    }

    @Profile("EN")
    @Bean("i18nService")
    I18EnglishGreetingService i18EnglishGreetingService(GreetingFactory factory){
        return (I18EnglishGreetingService) factory.getGreeting("EN");
    }

    @Profile({"ES", "default"})
    @Bean("i18nService")
    I18SpanishGreetingService i18SpanishGreetingService(GreetingFactory factory){
        return (I18SpanishGreetingService) factory.getGreeting("ES");
    }

    @Primary
    @Bean
    PrimaryGreetingService primaryGreetingService(){
        return new PrimaryGreetingService();
    }
}
