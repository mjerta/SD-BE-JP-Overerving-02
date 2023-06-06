package nl.novi.javaprogrammeren.overerving;

import java.time.DayOfWeek;

public class Tiger extends WildAnimal {

    private int nrOfStripes;


    protected Tiger(String name, String sex, String birthCountry, String habitat) {
        super(name, sex, birthCountry, habitat);
    }

    public int getNrOfStripes() {
        return nrOfStripes;
    }

    public void setNrOfStripes(int nrOfStripes) {
        this.nrOfStripes = nrOfStripes;
    }

    @Override
    public void makeSound() {
        System.out.println("Rrrrrrr");
    }
}
