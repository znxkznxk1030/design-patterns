package factorymethod.pizza.newyork;

import factorymethod.pizza.Pizza;

public class NYStylePepperoniPizza extends Pizza {
  public NYStylePepperoniPizza() {
    this.name = "뉴욕 스타일 소스와 페페로니 피자";
    this.dough = "씬 크러스트 피자";
    this.sause = "마리나라 소스";
    this.toppings.add("얇게 잘린 페페로니");
  }
}
