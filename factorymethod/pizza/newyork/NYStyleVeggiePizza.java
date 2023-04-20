package factorymethod.pizza.newyork;

import factorymethod.pizza.Pizza;

public class NYStyleVeggiePizza extends Pizza {
  public NYStyleVeggiePizza() {
    this.name = "뉴욕 스타일 소스와 야채 피자";
    this.dough = "씬 크러스트 피자";
    this.sause = "마리나라 소스";
    this.toppings.add("야채 토핑");
  }
}
