package factorymethod;

import factorymethod.pizza.Pizza;
import factorymethod.store.ChicagoPizzaStore;
import factorymethod.store.NYPizzaStore;
import factorymethod.store.PizzaStore;

public class PizzaTestDrive {
  public static void main(String[] args) {
    PizzaStore nyStore = new NYPizzaStore();
    Pizza nyPizza = nyStore.orderPizza("Cheese");
    System.out.println(nyPizza.getName());

    System.out.println();

    PizzaStore chicagoStore = new ChicagoPizzaStore();
    Pizza chicagoPizza = chicagoStore.orderPizza("Veggie");
    System.out.println(chicagoPizza.getName());
  }
}
