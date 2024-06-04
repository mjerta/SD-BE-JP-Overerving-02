package nl.novi.javaprogrammeren.overerving;

public class Wolf extends WildAnimals {
  private String roedelName;

  public Wolf(String name, String gender, int age, String cage, String lastFed, String origin, String roedelName) {
    super(name, gender, age, cage, lastFed, origin);
    this.roedelName = roedelName;
  }

  @Override
  public void makeSound() {
    System.out.println("Houwwwwwuuuuhuuu");
  }

  public void printPropertys() {
    System.out.println("Name : " + super.getName());
    System.out.println("Gender : " + super.getGender());
    System.out.println("Age : " + super.getAge());
    System.out.println("Cage : " + super.getCage());
    System.out.println("Last Fed : " + super.getLastFed());
    System.out.println("Origin : " + super.getOrigin());
    System.out.println("Name of : " + roedelName);
    System.out.println();
  }
}
