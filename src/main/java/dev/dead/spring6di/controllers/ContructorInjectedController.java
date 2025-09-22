package dev.dead.spring6di.controllers;

import dev.dead.spring6di.services.GreetingService;
import dev.dead.spring6di.services.GreetingServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;

@Slf4j
@Controller
public class ContructorInjectedController {
    private final GreetingService greetingService;
    public ContructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    public  String sayHello(){
        return greetingService.sayGreeting();
    }

}
