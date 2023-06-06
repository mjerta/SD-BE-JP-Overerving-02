package nl.novi.javaprogrammeren.overerving;

public class Cat extends DomesticAnimal {

    private CatType catType;

    public Cat(String name, String sex, String breed, String nameOfTheOwner, String favoriteFoodBrand, CatType catType) {
        super(name, sex, breed, nameOfTheOwner, favoriteFoodBrand);
        this.catType = catType;
    }

    public CatType getCatType() {
        return catType;
    }

    public void setCatType(CatType catType) {
        this.catType = catType;
    }

    @Override
    public void makeSound() {
        System.out.println("Miauw");
    }

    public enum CatType {
        INSIDE,
        OUTSIDE
    }
}
