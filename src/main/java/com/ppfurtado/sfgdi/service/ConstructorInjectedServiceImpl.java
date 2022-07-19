package com.ppfurtado.sfgdi.service;

import org.springframework.stereotype.Service;

@Service
public class ConstructorInjectedServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World ConstructorInjected";
    }
}
