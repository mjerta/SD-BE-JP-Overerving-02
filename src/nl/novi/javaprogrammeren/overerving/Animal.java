package nl.novi.javaprogrammeren.overerving;

public abstract class Animal {

    private final String name;
    private final String sex;

    protected Animal(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public void move() {
        System.out.println("0.25 meter verplaatst");
    }

    public void sleep() {
        System.out.println("8 uur slapen");
    }

    public void eat(String food) {
        System.out.println("Eating food " + food);
    }


    public abstract void makeSound();
}
