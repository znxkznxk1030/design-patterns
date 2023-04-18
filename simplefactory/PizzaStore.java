package simplefactory;

import simplefactory.pizza.Pizza;

public class PizzaStore {
  private SimplePizzaFactory factory;

  PizzaStore(SimplePizzaFactory factory) {
    this.factory = factory;
  }

  public Pizza orderPizza(String type) {
    Pizza pizza = factory.createPizza(type);

    pizza.spin();
    pizza.spreadSauce();
    pizza.toString();
    pizza.bake();
    pizza.cut();
    
    return pizza;
  }

}
