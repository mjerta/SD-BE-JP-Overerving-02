package nl.novi.javaprogrammeren.overerving;

public abstract class Animal {

  private String name;
  private String gender;
  private int age;


  private double location;

  public Animal(String name, String gender, int age) {
    this.name = name;
    this.gender = gender;
    this.age = age;
  }

  public void moveAnimal(double amount) {
    this.location =+ amount;
  }

  public abstract String makeSound();

  //sleep method

  //eat method

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public double getLocation() {
    return location;
  }

  public void setLocation(double location) {
    this.location = location;
  }
}
