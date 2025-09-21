package dev.dead.spring6di.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayHello() {
        log.info("Hello from GreetingServiceImpl - Baser Service");
        return "Hello Everyone From Base Service!";
    }
}
