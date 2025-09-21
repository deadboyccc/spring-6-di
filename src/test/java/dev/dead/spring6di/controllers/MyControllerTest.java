package dev.dead.spring6di.controllers;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
@SpringBootTest
class MyControllerTest {

    @Test
    void testGreetingService() {
        MyController controller = new MyController();
        log.info("test controller no di: "+controller.sayHello());
        assertNotNull(controller);

    }

}