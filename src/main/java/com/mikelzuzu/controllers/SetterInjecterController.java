package com.mikelzuzu.controllers;

import com.mikelzuzu.services.GreetingService;

public class SetterInjecterController {
    private GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
