package nl.novi.javaprogrammeren.overerving;

public class Dog extends PetAnimal {
  public Dog(String name, String gender, int age, String petOwner, String favouriteFoodBrand, String species) {
    super(name, gender, age, petOwner, favouriteFoodBrand, species);
  }

  @Override
  public void makeSound() {
    System.out.println("Woef Woef");
  }

  public void printPropertys() {
    System.out.println("Name : " + super.getName());
    System.out.println("Gender : " + super.getGender());
    System.out.println("Age : " + super.getAge());
    System.out.println("Dog owner : " + super.getPetOwner());
    System.out.println("Favourite food brand : " + super.getFavouriteFoodBrand());
    System.out.println("Species : " + super.getSpecies());
    System.out.println();
  }
}
