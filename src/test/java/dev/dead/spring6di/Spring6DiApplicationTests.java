package dev.dead.spring6di;

import dev.dead.spring6di.controllers.MyController;
import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import java.util.Objects;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class Spring6DiApplicationTests {
    @Autowired
    ApplicationContext applicationContext;
    @Autowired
    MyController myController;

    @Test
    void testAutoWireOfController() {
        System.out.println(myController.sayHello());
        assertThat(myController.sayHello()).isEqualTo("Hello");
    }
    @Test
    void testApplicationContextGetController(){
        var controller =applicationContext.getBean(MyController.class);
        System.out.println(controller.sayHello());
        // assert controller not null
        assertThat(controller.sayHello()).isEqualTo("Hello");
    }

    @Test
    void contextLoads() {
    }

}
