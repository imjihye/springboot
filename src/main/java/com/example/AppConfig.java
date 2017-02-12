package com.example;

import com.example.calculator.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by kimjihye on 2017. 2. 11..
 */

@Configuration // javaConfig용 클래스임을 컴파일러에게 알린다.
public class AppConfig {
    @Bean
    // DI컨테이너가 관리할 Bean. Bean은 DI컨테이터에 의하여 관리된다.
    // 이 메서드가 생성한 인스턴스가 싱클톤이 되며
    // DI컨테이너 별로 인스턴스(class) 한개가 생성된다.
    Calculator calculator(){
        return new AddCalculator();
    }

    @Bean
    ArgumentResolver argumentResolver(){
        return new ScannerArgumentResolver();
    }

    @Bean
    Frontend frontend(){
        return new Frontend();
    }
}
