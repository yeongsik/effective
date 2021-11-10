package com.example.effective.item2;

import static com.example.effective.item2.NyPizza.Size.SMALL;
import static com.example.effective.item2.Pizza.Topping.*;

public class PizzaApp {

    NyPizza pizza = new NyPizza.Builder(SMALL)
            .addTopping(SAUSAGE).addTopping(ONION).build();

    Calzone calzone = new Calzone.Builder()
            .addTopping(HAM).sauceInside().build();

    /*
    핵심 정리
    생성자나 정적 팩터리가 처리해야 할 매개변수가 많다면 빌더 패턴을 선택하는 게 더 낫다.
    매개변수 중 다수가 필수가 아니거나 같은 타입이면 특히 더 그렇다.
    빌더는 점층적 생성자보다 클라이언트 코드를 읽고 쓰기가 훨씬 간결하고, 자바빈즈보다 훨씬 안전하다.
     */
}
