package dev.dead.spring6di.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Slf4j
@Primary
@Service
public class GreetingServicePrimary implements GreetingService {
    @Override
    public String sayGreeting() {
        log.info("GreetingServicePrimary.sayGreeting()");
        return "Hello";
    }
}
