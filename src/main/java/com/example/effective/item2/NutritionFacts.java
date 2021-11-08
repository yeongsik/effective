package com.example.effective.item2;

public class NutritionFacts {
    /* 점층적 생성자 패턴 */
    /*
    점층적 생성자 패턴은 확장하기 어렵다.
    whY ? : 매개변수가 많으면 많을 수록 생성자를 계속해서 늘려야 하기 때문이다.
    클라이언트가 코드를 작성하거나 읽기가 어려워진다.
    생성자의 매개변수 순서를 한 눈에 보기에 어렵다.
     */
    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;

    public NutritionFacts(int servingSize, int servings) {
        this(servingSize, servings, 0);
    }

    public NutritionFacts(int servingSize, int servings, int calories) {
        this (servingSize , servings , calories , 0);

    }

    public NutritionFacts(int servingSize, int servings, int calories, int fat) {
        this(servingSize, servings, calories, fat, 0);
    }

    public NutritionFacts(int servingSize, int servings, int calories, int fat,
                          int sodium) {
        this(servingSize, servings, calories, fat, sodium, 0);

    }

    public NutritionFacts ( int servingSize , int servings , int calories , int fat ,
                            int sodium , int carbohydrate) {
        this.servingSize = servingSize;
        this.servings = servings;
        this.calories = calories;
        this.fat = fat;
        this.sodium = sodium;
        this.carbohydrate = carbohydrate;

    }
}
