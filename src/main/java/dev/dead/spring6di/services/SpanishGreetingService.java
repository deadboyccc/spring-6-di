package dev.dead.spring6di.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("localizedGreetingService")
@Slf4j
@Profile("ES")
public class SpanishGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        log.info("Hello from Spanish Service");
        return "Hola!";
    }
}
