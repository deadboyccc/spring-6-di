package dev.dead.spring6di.controllers;

import dev.dead.spring6di.services.GreetingService;
import dev.dead.spring6di.services.GreetingServiceImpl;
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
        return greetingService.sayGreeting();
//        return "Hello";
    }
    public void beforeInit(){
        System.out.println("## - Before Init - Called by Bean Post Processor");
    }

    public void afterInit(){
        System.out.println("## - After init called by Bean Post Processor");
    }
}
