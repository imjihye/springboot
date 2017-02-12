package com.example;

import com.example.calculator.Frontend;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

/**
 * Created by kimjihye on 2017. 2. 12..
 */

@EnableAutoConfiguration
@Import(AppConfig.class)
public class AppForDIFrontend {
    public static void main(String[] args){
        try (ConfigurableApplicationContext context =
                     SpringApplication.run(AppForDIFrontend.class, args)){
            Frontend frontend = context.getBean(Frontend.class);
            frontend.run();
        }
    }
}
