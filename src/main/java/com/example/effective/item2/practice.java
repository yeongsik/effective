package com.example.effective.item2;

public class practice {
    /*
    빌더 패턴으로 생성하기
     */
    NutritionFactsBuilder builder = new NutritionFactsBuilder.Builder(1,2)
            .calories(4).fat(3).sodium(1).carbohydrate(10).build();


}
