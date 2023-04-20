package factorymethod.pizza;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
  protected String name;
  protected String dough;
  protected String sause;
  protected List<String> toppings = new ArrayList<String>();

  public void prepare() {
    System.out.println("1. 도우 돌리기");
    System.out.println("2. 소스 펴 바르기");
    System.out.println("3. 토핑 올리기");
    toppings.stream().forEach(topping -> {
      System.out.println("\t" + topping);
    });
  }

  public void bake() {
    System.out.println("4. 오븐에 175도에서 25분간 굽기");
  }

  public void cut() {
    System.out.println("5. 피자를 사선으로 커팅하기");
  }

  public void box() {
    System.out.println("6. 상자에 피자 담기");
  }

  public String getName() {
    return name;
  }
}
