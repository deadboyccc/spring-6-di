package dev.dead.spring6di.controllers;

import dev.dead.spring6di.services.GreetingServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
class ContructorInjectedControllerTest {

    ContructorInjectedController contructorInjectedController;
    @BeforeEach
    void setUp() {
        contructorInjectedController = new ContructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    void sayHello() {
        log.info("Constructor Injected Controller Test");
        assertEquals("Hello", contructorInjectedController.sayHello());
    }
}