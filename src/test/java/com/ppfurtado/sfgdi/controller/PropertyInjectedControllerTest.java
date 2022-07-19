package com.ppfurtado.sfgdi.controller;

import com.ppfurtado.sfgdi.service.SetterInjectedServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new PropertyInjectedController();

        controller.greetingService = new SetterInjectedServiceImpl();
    }

    @Test
    void getGreeting() {

        System.out.println(controller.getGreeting());
    }
}