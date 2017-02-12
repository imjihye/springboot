package com.example;

import com.example.calculator.Calculator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

import java.util.Scanner;

/**
 * Created by kimjihye on 2017. 2. 11..
 */

@EnableAutoConfiguration
@Import(AppConfig.class) // JavaConfig를 읽어들이기 위해 @Configuration이 붙은 클래스를 지정한다.
public class AppForDICalculator {
    public static void main(String[] args){
        // 스프링부트 앱을 실행.
        // 첫번째 인자로는 EnabledAutoConfiguration이 붙은 클래스를 지정한다
        // 이때 반환하는 값은은 DI컨테이너의 본체는 ApllicationContext이다.
        try (ConfigurableApplicationContext context =
             SpringApplication.run(AppForDICalculator.class, args)) {

            System.out.print("Enter 2 numbers like 'a b' : ");
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            Calculator calculator = context.getBean(Calculator.class);
            // getBean을 통해 DI컨테이너에서 생성한 인스턴스를 받는다.
            // 실제 의존성 주입은 하지 않았음.
            // 실제 인스턴스는 DI컨테이너가 알아서 찾아주므로 애플리케이션 쪽에서는 신경쓰지 않아도 된다
            int result = calculator.calc(a, b);
            System.out.println("result = " + result);

            // 결론, DI컨테이너를 사용하면 애플리케이션 안에 있는 모듈 사이의의존성이 느슨해지고
            // 독립성이 커진다
        }
    }
}
