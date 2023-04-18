package simplefactory;

import simplefactory.pizza.Pizza;

public class PizzaTestDrive {
  public static void main(String[] args) {
    SimplePizzaFactory factory = new SimplePizzaFactory();
    PizzaStore store = new PizzaStore(factory);

    Pizza pizza = store.orderPizza("pepperoni");

    System.out.println("주문한 피자: " + pizza.getName());
  }
}
