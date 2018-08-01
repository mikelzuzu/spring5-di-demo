package com.mikelzuzu.controllers;

import com.mikelzuzu.services.GreetingServiceImpl;

// We do not want to do property injection
public class PropertyInjectedController {

    public GreetingServiceImpl greetingService;

    String sayHello() {
        return greetingService.sayGreeting();
    }

}
