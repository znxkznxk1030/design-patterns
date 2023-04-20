package factorymethod.pizza.chicago;

import factorymethod.pizza.Pizza;

public class ChicagoStyleVeggiePizza extends Pizza {

  public ChicagoStyleVeggiePizza() {
    this.name = "시카고 스타일 딥디쉬 야채 피자";
    this.dough = "아주 두꺼운 크러스트 피자";
    this.sause = "풀럼토마토 소스";
    this.toppings.add("야채 토핑");
  }

  @Override
  public void cut() {
    System.out.println("네모난 모양으로 피자 자르기");
  }

}
