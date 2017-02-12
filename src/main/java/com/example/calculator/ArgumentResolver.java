package com.example.calculator;

import java.io.InputStream;

/**
 * Created by kimjihye on 2017. 2. 12..
 */

//Calculator의 인자를 만들기 위해서..
public interface ArgumentResolver {
    // Argumnet 는 인자 객체를 표현한다.
    Argument resolve(InputStream stream);
}
