package com.ppfurtado.sfgdi.controller;

import com.ppfurtado.sfgdi.service.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorInjeectedControllerTest {

    ConstructorInjeectedController controller;

    @BeforeEach
    void setUp() {
        controller = new ConstructorInjeectedController(new GreetingServiceImpl());
    }

    @Test
    void sayGreeting() {
        System.out.println(controller.sayGreeting());
    }
}