package simplefactory;

import simplefactory.pizza.Pizza;
import simplefactory.pizza.impl.CheesePizza;
import simplefactory.pizza.impl.ClamPizza;
import simplefactory.pizza.impl.PepperoniPizza;
import simplefactory.pizza.impl.VeggiePizza;

public class SimplePizzaFactory {

  public Pizza createPizza(String type) {
    Pizza pizza = null;

    switch (type) {
      case "pepperoni":
        pizza = new PepperoniPizza();
        break;
      case "clam":
        pizza = new ClamPizza();
        break;
      case "veggie":
        pizza = new VeggiePizza();
        break;
      case "cheese":
      default:
        pizza = new CheesePizza();
        break;
    }

    return pizza;
  }

}
