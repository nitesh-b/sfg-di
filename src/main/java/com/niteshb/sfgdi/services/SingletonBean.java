package com.niteshb.sfgdi.services;

import org.springframework.stereotype.Component;

@Component
public class SingletonBean {

    public SingletonBean(){
        System.out.println("Creating SingleTon");
    }
    public String getMyScope(){
        return "Im SingleTon";
    }
}
