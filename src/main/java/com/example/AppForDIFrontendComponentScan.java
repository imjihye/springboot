package com.example;

import com.example.calculator.Frontend;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by kimjihye on 2017. 2. 12..
 */

@EnableAutoConfiguration
@ComponentScan
// 이 클레스의 패키지 내부에 있는 모든 클레스를 검색한다. 검색조건은 @Component
// 따라서 빈을 정의해 둔 AppConfig클레스는 더이상 사용되지 않는다.
public class AppForDIFrontendComponentScan {
    public static void main(String[] args){
        try (ConfigurableApplicationContext context =
                     SpringApplication.run(AppForDIFrontendComponentScan.class)) {
            Frontend frontend = context.getBean(Frontend.class);
            frontend.run();
        }
    }
}
