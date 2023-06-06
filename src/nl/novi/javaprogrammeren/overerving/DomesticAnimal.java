package nl.novi.javaprogrammeren.overerving;

public abstract class DomesticAnimal extends Animal {

    private final String breed;
    private String nameOfTheOwner;
    private String favoriteFoodBrand;


    protected DomesticAnimal(String name, String sex, String breed, String nameOfTheOwner, String favoriteFoodBrand) {
        super(name, sex);
        this.breed = breed;
        this.nameOfTheOwner = nameOfTheOwner;
        this.favoriteFoodBrand = favoriteFoodBrand;
    }

    public String getBreed() {
        return breed;
    }

    public String getNameOfTheOwner() {
        return nameOfTheOwner;
    }

    public void setNameOfTheOwner(String nameOfTheOwner) {
        this.nameOfTheOwner = nameOfTheOwner;
    }

    public String getFavoriteFoodBrand() {
        return favoriteFoodBrand;
    }

    public void setFavoriteFoodBrand(String favoriteFoodBrand) {
        this.favoriteFoodBrand = favoriteFoodBrand;
    }
}
