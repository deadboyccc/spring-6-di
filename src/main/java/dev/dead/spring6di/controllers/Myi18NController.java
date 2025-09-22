package dev.dead.spring6di.controllers;

import dev.dead.spring6di.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class Myi18NController {
    private final GreetingService greetingService;
    public Myi18NController(@Qualifier("localizedGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;

    }
    public String sayLocalizedHello(){
        return greetingService.sayGreeting();
    }
}
