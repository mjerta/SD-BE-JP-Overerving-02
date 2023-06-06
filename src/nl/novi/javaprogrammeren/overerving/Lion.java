package nl.novi.javaprogrammeren.overerving;

public class Lion extends WildAnimal {

    private int nrOfChildren;


    public Lion(String name, String sex, String birthCountry, String habitat, int nrOfChildren) {
        super(name, sex, birthCountry, habitat);
        this.nrOfChildren = nrOfChildren;
    }

    public int getNrOfChildren() {
        return nrOfChildren;
    }

    public void setNrOfChildren(int nrOfChildren) {
        this.nrOfChildren = nrOfChildren;
    }

    @Override
    public void makeSound() {
        System.out.println("Wror!");
    }
}
