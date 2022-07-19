package com.ppfurtado.sfgdi.controller;

import com.ppfurtado.sfgdi.service.SetterInjectedServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjeectedControllerTest {

    ConstructorInjeectedController controller;

    @BeforeEach
    void setUp() {
        controller = new ConstructorInjeectedController(new SetterInjectedServiceImpl());
    }

    @Test
    void sayGreeting() {
        System.out.println(controller.sayGreeting());
    }
}