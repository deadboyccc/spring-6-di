package dev.dead.spring6di.controllers;

import dev.dead.spring6di.services.GetEnvService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;

@Controller
@Slf4j
@RequiredArgsConstructor
public class GetEnvController {
    private final GetEnvService getEnvService;
    public String getEnv(){
        return String.format("You are in %s environment",getEnvService.getEnv());
    }

}
