package com.f_lin.example;

import com.f_lin.example.java.scheduler.QuartzConfig;
import com.f_lin.example.ons.OnsConfigs;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({OnsConfigs.class, QuartzConfig.class})
public class ExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExampleApplication.class, args);


    }

}
