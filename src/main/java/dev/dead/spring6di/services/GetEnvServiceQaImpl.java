package dev.dead.spring6di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("qa")
@Service
public class GetEnvServiceQaImpl implements GetEnvService {
    @Override
    public String getEnv() {
        return "qa";
    }
}
