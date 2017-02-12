package com.example.calculator;

/**
 * Created by kimjihye on 2017. 2. 12..
 */

//@Data
//@RequiredArgsConstructor
public class Argument {
    private final int a;
    private final int b;

    public Argument(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA(){
        return this.a;
    }

    public int getB(){
        return this.b;
    }
}
