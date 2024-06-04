package nl.novi.javaprogrammeren.overerving;

public abstract class WildAnimals extends Animal {

  private String cage;
  private String lastFed;
  private String origin;

  public WildAnimals(String name, String gender, int age, String cage, String lastFed, String origin) {
    super(name, gender, age);
    this.cage = cage;
    this.lastFed = lastFed;
    this.origin = origin;
  }

  public String getCage() {
    return cage;
  }

  public void setCage(String cage) {
    this.cage = cage;
  }

  public String getLastFed() {
    return lastFed;
  }

  public void setLastFed(String lastFed) {
    this.lastFed = lastFed;
  }

  public String getOrigin() {
    return origin;
  }

  public void setOrigin(String origin) {
    this.origin = origin;
  }

}


