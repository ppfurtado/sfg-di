package com.ppfurtado.sfgdi.controller;

import com.ppfurtado.sfgdi.service.GreetingService;

public class ConstructorInjeectedController {
    private final GreetingService greetingService;

    public ConstructorInjeectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayGreeting(){
        return greetingService.sayGreeting();
    }
}
