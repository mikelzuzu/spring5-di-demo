package com.mikelzuzu.controllers;

import com.mikelzuzu.services.GreetingService;

public class ContructorInjectedController {

    private GreetingService greetingService;

    public ContructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
