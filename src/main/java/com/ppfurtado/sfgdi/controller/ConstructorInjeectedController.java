package com.ppfurtado.sfgdi.controller;

import com.ppfurtado.sfgdi.service.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjeectedController {
    private final GreetingService greetingService;


    public ConstructorInjeectedController(@Qualifier("constructorInjectedServiceImpl") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayGreeting(){
        return greetingService.sayGreeting();
    }
}
