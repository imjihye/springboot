package com.example;

import com.example.calculator.Argument;
import com.example.calculator.ArgumentResolver;
import com.example.calculator.Calculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by kimjihye on 2017. 2. 12..
 */

@EnableAutoConfiguration
@ComponentScan
public class AppForDIFrontendCommandLineRunner implements CommandLineRunner {
    @Autowired
    ArgumentResolver argumentResolver;
    @Autowired
    Calculator calculator;

    @Override
    // CommandLineRunner 인터페이서를 구현하므로써 의존성 주입을 할수 있다.
    public void run(String... strings) throws Exception {
        System.out.println("Enter 2 numbers like 'a b' :");
        Argument argument = argumentResolver.resolve(System.in);
        int result = calculator.calc(argument.getA(), argument.getB());
        System.out.println("result : " + result);
    }

    public static void main(String[] args){
        SpringApplication.run(AppForDIFrontendCommandLineRunner.class, args);
    }
}
