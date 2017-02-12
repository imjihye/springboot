package com.example.calculator;

import org.springframework.stereotype.Component;

/**
 * Created by kimjihye on 2017. 2. 11..
 */

@Component
public class AddCalculator implements Calculator {
    @Override
    public int calc(int a, int b) {
        return a + b;
    }
}
