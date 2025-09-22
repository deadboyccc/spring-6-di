package dev.dead.spring6di.controllers;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
@ActiveProfiles("uat")
@SpringBootTest
class GetEnvControllerTest {
    @Autowired
    GetEnvController controller;

    @Test
    void getDefaultEnv() {
        String env = controller.getEnv();
        log.info("Get default env: {}", env);
        assertEquals("You are in dev environment", env);

    }
    @Test
    void getDevEnv() {
        String env = controller.getEnv();
        log.info("Get dev env: {}", env);
        assertEquals("You are in dev environment", env);
    }
    @Test
    void getQaEnv() {
        String env = controller.getEnv();
        log.info("Get qa env: {}", env);
        assertEquals("You are in qa environment", env);

    }
    @Test
    void getUatEnv() {
        String env = controller.getEnv();
        log.info("Get uat env: {}", env);
        assertEquals("You are in uat environment", env);

    }
    @Test
    void getProdEnv() {
        String env = controller.getEnv();
        log.info("Get prod env: {}", env);
        assertEquals("You are in prod environment", env);

    }

}