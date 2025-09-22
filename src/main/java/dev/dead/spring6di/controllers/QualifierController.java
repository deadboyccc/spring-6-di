package dev.dead.spring6di.controllers;

import dev.dead.spring6di.services.GreetingService;
import dev.dead.spring6di.services.GreetingServicePrimary;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class QualifierController {
    private  final GreetingService greetingService;
    public QualifierController(@Qualifier("standardGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;

    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
