package com.ppfurtado.sfgdi.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("i18nService")
public class I18NEnglishService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - English profile";
    }
}
