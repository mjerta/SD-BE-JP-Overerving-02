package nl.novi.javaprogrammeren.overerving;

import java.time.DayOfWeek;

public class Wolf extends WildAnimal {

    public Wolf(String name, String sex, String birthCountry, String habitat) {
        super(name, sex, birthCountry, habitat);
    }

    @Override
    public void makeSound() {
        System.out.println("Ahoeeeeee");
    }
}
