package com.example.effective.item2;

public class NutritionFacts2 {
    /*
    자바빈즈 패턴
    매개 변수가 없는 생성자로 객체를 만든 후,
    세터 메서드들을 호출해 원하는 매개변수의 값을 설정하는 방식

    점층적 생성자의 단점들은 여기서 보이진 않는다.
    set메서드로 해당 변수값이 얼마가 들어가는지 명확하게 볼 수 있다.

    But
    객체 하나를 만들려면 메서드를 여러개 호출해야 하는 단점
    + 객체가 완성되기 전에 일관성이 무너진 상태로 놓이게 된다.

    점층적 생성자 패턴에서는 매개변수들이 유효한지를 생성자에서만 확인하면 일관성 유지할 수 있었는데
    여기서는 그 장치가 없다.

    자바빈즈 패턴은 클래스를 불변으로 만들 수 없다. 스레드 안전성을 얻으려면 프로그래머가 추가 작업을 해줘야 함
     */
    private int servingSize = -1;
    private int servings = -1;
    private int calories = 0;
    private int fat = 0;
    private int sodium = 0;
    private int carbohydrate = 0;

    public NutritionFacts2() {}

    public void setServingSize(int val ) {
        servingSize = val;}
    public void setServings(int val) {
        servings = val;
    }

    public void setCalories(int val) {
        calories = val;
    }

    public void setFat(int val) {
        fat = val;
    }

    public void setSodium(int val) {
        sodium = val;
    }

    public void setCarbohydrate(int val) {
        carbohydrate = val;
    }
}
