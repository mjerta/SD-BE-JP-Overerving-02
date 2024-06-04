package nl.novi.javaprogrammeren.overerving;

public class WildAnimals extends Animal {

  String cage;
  String lastFed;
  String origin;


  public WildAnimals(String name, String gender, int age, String cage, String lastFed, String origin) {
    super(name, gender, age);
    this.cage = cage;
    this.lastFed = lastFed;
    this.origin = origin;
  }

  @Override
  public String makeSound() {
    return "";
  }
}


