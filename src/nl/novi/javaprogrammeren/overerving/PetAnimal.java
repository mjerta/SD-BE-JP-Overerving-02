package nl.novi.javaprogrammeren.overerving;

public abstract class PetAnimal extends Animal {

  private String petOwner;
  private String favouriteFoodBrand;
  private String species;

  public PetAnimal(String name, String gender, int age, String petOwner, String favouriteFoodBrand, String species) {
    super(name, gender, age);
    this.petOwner = petOwner;
    this.favouriteFoodBrand = favouriteFoodBrand;
    this.species = species;
  }

  public String getPetOwner() {
    return petOwner;
  }

  public void setPetOwner(String petOwner) {
    this.petOwner = petOwner;
  }

  public String getFavouriteFoodBrand() {
    return favouriteFoodBrand;
  }

  public void setFavouriteFoodBrand(String favouriteFoodBrand) {
    this.favouriteFoodBrand = favouriteFoodBrand;
  }

  public String getSpecies() {
    return species;
  }

  public void setSpecies(String species) {
    this.species = species;
  }
}
