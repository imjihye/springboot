package com.example;

import com.example.calculator.Argument;
import com.example.calculator.ArgumentResolver;
import com.example.calculator.Calculator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

/**
 * Created by kimjihye on 2017. 2. 12..
 */

@EnableAutoConfiguration
@Import(AppConfig.class)
public class AppForDIArgument {
    public static void main(String[] args){
        try(ConfigurableApplicationContext context =
            SpringApplication.run(AppForDIArgument.class, args)){
`
            System.out.print("Enter 2 numbers like 'a b' : ");
            ArgumentResolver argumentResolver = context.getBean(ArgumentResolver.class);
            Argument argument = argumentResolver.resolve(System.in);

            Calculator calculator = context.getBean(Calculator.class);
            int result = calculator.calc(argument.getA(), argument.getB());
            System.out.println("result = " + result);
        }
    }
}
