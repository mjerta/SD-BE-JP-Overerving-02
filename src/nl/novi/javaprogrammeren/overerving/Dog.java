package nl.novi.javaprogrammeren.overerving;

public class Dog extends DomesticAnimal {

    public Dog(String name, String sex, String breed, String nameOfTheOwner, String favoriteFoodBrand) {
        super(name, sex, breed, nameOfTheOwner, favoriteFoodBrand);
    }

    @Override
    public void makeSound() {
        System.out.println("Woef");
    }
}
