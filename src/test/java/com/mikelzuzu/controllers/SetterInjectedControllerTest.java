package com.mikelzuzu.controllers;

import com.mikelzuzu.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SetterInjectedControllerTest {
    private  SetterInjecterController setterInjecterController;

    @Before
    public void setUp() throws Exception {
        this.setterInjecterController = new SetterInjecterController();
        this.setterInjecterController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() throws Exception {
        assertEquals(GreetingServiceImpl.HELLO, setterInjecterController.sayHello());
    }
}
