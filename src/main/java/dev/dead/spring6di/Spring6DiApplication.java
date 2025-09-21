package dev.dead.spring6di;

import dev.dead.spring6di.controllers.MyController;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class Spring6DiApplication {

    public static void main(String[] args) {
        var ctx = SpringApplication.run(Spring6DiApplication.class, args);
        var controller = ctx.getBean(MyController.class);
        log.info("In Main Method");
        log.info(controller.sayHello());
    }



}
