package nl.novi.javaprogrammeren.overerving;

import java.time.DayOfWeek;

public abstract class WildAnimal extends Animal {
    private final String birthCountry;
    private String habitat;
    private DayOfWeek lastFed;

    protected WildAnimal(String name, String sex, String birthCountry, String habitat) {
        super(name, sex);
        this.birthCountry = birthCountry;
        this.habitat = habitat;
    }

    public String getBirthCountry() {
        return birthCountry;
    }

    public DayOfWeek getLastFed() {
        return lastFed;
    }

    public void setLastFed(DayOfWeek lastFed) {
        this.lastFed = lastFed;
    }
}
