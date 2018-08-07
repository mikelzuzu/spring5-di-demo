package com.mikelzuzu.services;

import org.springframework.stereotype.Component;

@Component
public class GreetingRepositoryImpl implements GreetingRepository {
    @Override
    public String getEnglishGreeting() {
        return "Hello - I was injected by primary greeting service";
    }

    @Override
    public String getSpanishGreeting() {
        return "Servicio de saludo primario";
    }

    @Override
    public String getGermanGreeting() {
        return "Primärer Begrüßungsdienst";
    }
}
