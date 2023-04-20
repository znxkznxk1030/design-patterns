package factorymethod.store;

import factorymethod.pizza.Pizza;
import factorymethod.pizza.chicago.ChicagoStyleCheesePizza;
import factorymethod.pizza.chicago.ChicagoStyleClamPizza;
import factorymethod.pizza.chicago.ChicagoStylePepperoniPizza;
import factorymethod.pizza.chicago.ChicagoStyleVeggiePizza;

public class ChicagoPizzaStore extends PizzaStore {

  @Override
  Pizza createPizza(String type) {
    switch (type) {
      case "Cheese":
        return new ChicagoStyleCheesePizza();
      case "Pepperoni":
        return new ChicagoStylePepperoniPizza();
      case "Clam":
        return new ChicagoStyleClamPizza();
      case "Veggie":
        return new ChicagoStyleVeggiePizza();
      default:
        return null;
    }
  }

}
