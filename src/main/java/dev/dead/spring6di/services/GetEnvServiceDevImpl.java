package dev.dead.spring6di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"dev","default"})
public class GetEnvServiceDevImpl implements GetEnvService {
    @Override
    public String getEnv() {
        return "dev";
    }
}
