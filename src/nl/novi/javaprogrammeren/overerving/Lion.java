package nl.novi.javaprogrammeren.overerving;

public class Lion extends WildAnimals {

  private int childrenAmount;

  public Lion(String name, String gender, int age, String cage, String lastFed, String origin, int childrenAmount) {
    super(name, gender, age, cage, lastFed, origin);
    this.childrenAmount = childrenAmount;
  }

  @Override
  public void makeSound() {
    System.out.println("Raw");
  }

  public void printPropertys() {
    System.out.println("Name : " + super.getName());
    System.out.println("Gender : " + super.getGender());
    System.out.println("Age : " + super.getAge());
    System.out.println("Cage : " + super.getCage());
    System.out.println("Last Fed : " + super.getLastFed());
    System.out.println("Origin : " + super.getOrigin());
    System.out.println("Amount of children : " + childrenAmount);
    System.out.println();
  }
}
