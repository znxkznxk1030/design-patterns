package factorymethod.pizza.newyork;

import factorymethod.pizza.Pizza;

public class NYStyleClamPizza extends Pizza {
  public NYStyleClamPizza() {
    this.name = "뉴욕 스타일 소스와 클램 피자";
    this.dough = "씬 크러스트 피자";
    this.sause = "마리나라 소스";
    this.toppings.add("잘게 썬 클램");
  }
}
