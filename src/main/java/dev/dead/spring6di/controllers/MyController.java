package dev.dead.spring6di.controllers;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;

@RequiredArgsConstructor
@Controller
@Slf4j
public class MyController {
    public String sayHello() {
        log.info("In Controller");
        return "Hello";
    }
}
