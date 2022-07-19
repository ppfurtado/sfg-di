package com.ppfurtado.sfgdi;

import com.ppfurtado.sfgdi.controller.ConstructorInjeectedController;
import com.ppfurtado.sfgdi.controller.MyController;
import com.ppfurtado.sfgdi.controller.PropertyInjectedController;
import com.ppfurtado.sfgdi.controller.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SfgDiApplication.class, args);

        System.out.println("--------- My Bean Primary");
        MyController theBean = context.getBean( "myController", MyController.class);
        System.out.println(theBean.sayHello());

        System.out.println("--------- Property");
        PropertyInjectedController propertyInjectedController = context.getBean("propertyInjectedController", PropertyInjectedController.class);
        System.out.println(propertyInjectedController.getGreeting());

        System.out.println("--------- Setter");
        SetterInjectedController setterInjectedController = context.getBean("setterInjectedController", SetterInjectedController.class);
        System.out.println(setterInjectedController.getGreeting());

        System.out.println("--------- Construtor");
        ConstructorInjeectedController constructorInjeectedController = context.getBean("constructorInjeectedController", ConstructorInjeectedController.class);
        System.out.println(constructorInjeectedController.sayGreeting());
    }

}
