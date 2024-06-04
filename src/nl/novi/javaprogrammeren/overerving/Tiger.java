package nl.novi.javaprogrammeren.overerving;

public class Tiger extends WildAnimals {
  private int stripesAmount;

  public Tiger(String name, String gender, int age, String cage, String lastFed, String origin, int stripesAmount) {
    super(name, gender, age, cage, lastFed, origin);
    this.stripesAmount = stripesAmount;

  }

  @Override
  public void makeSound() {
    System.out.println("Graauw");
  }

  public void printPropertys() {
    System.out.println("Name : " + super.getName());
    System.out.println("Gender : " + super.getGender());
    System.out.println("Age : " + super.getAge());
    System.out.println("Cage : " + super.getCage());
    System.out.println("Last Fed : " + super.getLastFed());
    System.out.println("Origin : " + super.getOrigin());
    System.out.println("Amount of stripe : " + stripesAmount);
    System.out.println();
  }
}
