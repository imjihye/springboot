package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by kimjihye on 2017. 2. 11..
 */

@RestController // 요청을 받아들이는 컨트롤러 클래스임을 나타낸다
@EnableAutoConfiguration
public class App {

    @RequestMapping("/") // HTTP요청을 받아들이는 메서드 이다
    String home(){
        return "Hello World!!!"; // HTTP 응답으로 출력됨
    }

    // 어플리 케이션 실행.
    // 1. run main
    // 2. command) mvn spring-boot:run
    public static void main(String[] args){
        SpringApplication.run(App.class, args);
    }

    // 배포하거나 실행할수 있는 형식인 jar
    // 만들기 - command) mvn package
    // 실행 - command) java -jar xxx.jar
}
