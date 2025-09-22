package dev.dead.spring6di.controllers;

import dev.dead.spring6di.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;

public class SetterInjectedController {
    private  GreetingService greetingService;

    // setter for greetingService (no spring)
    // @Autowired
    public void setGreetingService( GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    public String sayHello(){
        return greetingService.sayGreeting();
    }

}
