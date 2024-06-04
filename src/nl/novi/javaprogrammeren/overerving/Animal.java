package nl.novi.javaprogrammeren.overerving;

import com.sun.nio.sctp.AbstractNotificationHandler;

public abstract class Animal {

  private String name;
  private String gender;
  private int age;

  public Animal(String name, String gender, int age) {
    this.name = name;
    this.gender = gender;
    this.age = age;
  }

  public abstract void makeSound();

  public void moveAnimal() {
    System.out.println("The " + name + " moved 25cm.");
  }

  public void sleepAnimal() {
    System.out.println("The " + name + " went to sleep for 8 hours.");
  }

  public void feedAnimal(String food) {
    System.out.println("The " + name + " is eating a " + food);
  }

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

}
