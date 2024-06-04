package nl.novi.javaprogrammeren.overerving;

public class Cat extends PetAnimal {
  boolean indoorCat;

  public Cat(String name, String gender, int age, String petOwner, String favouriteFoodBrand, String species, boolean indoorCat) {
    super(name, gender, age, petOwner, favouriteFoodBrand, species);
    this.indoorCat = indoorCat;
  }

  @Override
  public void makeSound() {
    System.out.println("Miaaauuuww");
  }

  public void printPropertys() {
    System.out.println("Name : " + super.getName());
    System.out.println("Gender : " + super.getGender());
    System.out.println("Age : " + super.getAge());
    System.out.println("Cat owner : " + super.getPetOwner());
    System.out.println("Favourite food brand : " + super.getFavouriteFoodBrand());
    System.out.println("Species : " + super.getSpecies());
    if (indoorCat) {
      System.out.println("This is a indoor cat");
    } else {

      System.out.println("This is a outdoor cat");
    }
    System.out.println();
  }
}
