package factorymethod.store;

import factorymethod.pizza.Pizza;
import factorymethod.pizza.newyork.NYStyleCheesePizza;
import factorymethod.pizza.newyork.NYStyleClamPizza;
import factorymethod.pizza.newyork.NYStylePepperoniPizza;
import factorymethod.pizza.newyork.NYStyleVeggiePizza;

public class NYPizzaStore extends PizzaStore {

  @Override
  Pizza createPizza(String type) {
    switch (type) {
      case "Cheese":
        return new NYStyleCheesePizza();
      case "Pepperoni":
        return new NYStylePepperoniPizza();
      case "Clam":
        return new NYStyleClamPizza();
      case "Veggie":
        return new NYStyleVeggiePizza();
      default:
        return null;
    }
  }

}
