package dev.dead.spring6di.controllers;

import dev.dead.spring6di.services.GreetingService;
import dev.dead.spring6di.services.GreetingServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;

@Controller
@Slf4j
public class MyController {
    private final GreetingService greetingService;
    MyController() {
        this.greetingService = new GreetingServiceImpl();
    }
    public String sayHello() {
        log.info("In Controller");
        return greetingService.sayHello();
//        return "Hello";
    }
}
