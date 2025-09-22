package dev.dead.spring6di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("prod")
@Service
public class GetEnvServiceProdImpl implements GetEnvService {
    @Override
    public String getEnv() {
        return "prod";
    }
}
