package dev.dead.spring6di.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Slf4j
@Profile({"EN","default"})
@Service("localizedGreetingService")
public class EnglishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        log.info("Hello from English Service");
        return "Hello!";
    }
}
