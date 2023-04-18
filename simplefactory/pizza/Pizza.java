package simplefactory.pizza;

public abstract class Pizza {
  public abstract String getName();

  public void spin() {
    System.out.println("1. 도우 돌리기");
  }

  public void spreadSauce() {
    System.out.println("2. 소스 펴 바르기");
  }

  public void bake() {
    System.out.println("3. 오븐에 굽기");
  }

  public void cut() {
    System.out.println("4. 피자 커팅하기");
  }
}
