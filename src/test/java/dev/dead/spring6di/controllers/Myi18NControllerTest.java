package dev.dead.spring6di.controllers;

import dev.dead.spring6di.services.GreetingService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;


//@ActiveProfiles()
@SpringBootTest
class Myi18NControllerTest {
    @Autowired
     Myi18NController localizedController;

    @Test
    void sayLocalizedHelloSpanish() {
        assertEquals("Hola!", localizedController.sayLocalizedHello());
    }
    @Test
    void sayLocalizedHelloEnglish(){

        assertEquals("Hello!", localizedController.sayLocalizedHello());
    }
    @Test
    void sayLocalizedHelloDefault(){
        assertEquals("Hello!", localizedController.sayLocalizedHello());

    }

}