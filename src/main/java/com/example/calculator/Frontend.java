package com.example.calculator;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by kimjihye on 2017. 2. 12..
 */
public class Frontend {
    @Autowired
    ArgumentResolver argumentResolver;
    @Autowired // DI컨테이너가 주입해야 할 필드.
    Calculator calculator;

    public void run(){
        System.out.println("Enter 2 numbers like 'a b' :");
        Argument argument = argumentResolver.resolve(System.in);
        int result = calculator.calc(argument.getA(), argument.getB());
        System.out.println("result = " + result);
    }
}