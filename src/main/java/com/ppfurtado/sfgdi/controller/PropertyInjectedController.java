package com.ppfurtado.sfgdi.controller;

import com.ppfurtado.sfgdi.service.GreetingService;

public class PropertyInjectedController {

    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }

}
