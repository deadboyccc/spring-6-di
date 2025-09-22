package dev.dead.spring6di.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("uat")
public class GetEnvServiceUatImpl implements GetEnvService {
    @Override
    public String getEnv() {
        return "uat";
    }
}
