package com.niteshb.sfgdi.config;

import com.niteshb.sfgdi.services.ConstructorGreetingService;
import com.niteshb.sfgdi.services.I18EnglishGreetingService;
import com.niteshb.sfgdi.services.I18SpanishGreetingService;
import com.niteshb.sfgdi.services.PrimaryGreetingService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Configuration
public class GreetingServiceConfig {

    @Bean
    ConstructorGreetingService constructorGreetingService(){
        return new ConstructorGreetingService();
    }

    @Profile("EN")
    @Bean("i18nService")
    I18EnglishGreetingService i18EnglishGreetingService(){
        return new I18EnglishGreetingService();
    }

    @Profile({"ES", "default"})
    @Bean("i18nService")
    I18SpanishGreetingService i18SpanishGreetingService(){
        return new I18SpanishGreetingService();
    }

    @Primary
    @Bean
    PrimaryGreetingService primaryGreetingService(){
        return new PrimaryGreetingService();
    }
}
