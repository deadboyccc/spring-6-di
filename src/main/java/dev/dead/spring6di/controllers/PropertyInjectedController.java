package dev.dead.spring6di.controllers;

import dev.dead.spring6di.services.GreetingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
@Slf4j
public class PropertyInjectedController {
    @Autowired
    GreetingService greetingService;
    public String sayHello() {
       return greetingService.sayGreeting();

    }
}
