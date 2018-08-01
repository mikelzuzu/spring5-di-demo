package com.mikelzuzu.controllers;

import com.mikelzuzu.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

// We do not want to do property injection
@Controller
public class PropertyInjectedController {

    // Property name same as bean name
    @Autowired
    @Qualifier("greetingServiceImpl")
    public GreetingService greetingServiceImpl;

    public String sayHello() {
        return greetingServiceImpl.sayGreeting();
    }

}
