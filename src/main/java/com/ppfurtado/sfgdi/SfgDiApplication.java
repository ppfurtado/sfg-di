package com.ppfurtado.sfgdi;

import com.ppfurtado.sfgdi.controller.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SfgDiApplication.class, args);

        MyController theBean = context.getBean( "myController", MyController.class);

        String result = theBean.sayHello();

        System.out.println(result);

    }

}
