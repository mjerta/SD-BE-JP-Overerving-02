package nl.novi.javaprogrammeren.overerving;

public class Lion extends WildAnimals {

  public Lion(String name, String gender, int age, String cage, String lastFed, String origin) {
    super(name, gender, age, cage, lastFed, origin);
  }

  @Override
  public String makeSound() {
    return "Raw";
  }

  public void printPropertys() {
    System.out.println(getName());
  }
}
