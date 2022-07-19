package com.ppfurtado.sfgdi.controller;

import com.ppfurtado.sfgdi.service.PrimaryGreetingServiceImpl;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final PrimaryGreetingServiceImpl greetingService;

    public MyController(PrimaryGreetingServiceImpl greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
