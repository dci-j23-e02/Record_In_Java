package introduction;

import java.util.Objects;

public class TraditionalPerson {
 //Attributes
  private final String name;
  private  final String address;

 // Constructor
  public TraditionalPerson(String name, String address) {
    this.name = name;
    this.address = address;
  }

  // Getters

  public String getName() {
    return name;
  }

  public String getAddress() {
    return address;
  }


  // equals method


  @Override
  public boolean equals(Object other) {
    if (this == other) { // comparing the reference e.g. @2a84aee7
      return true;
    }
    if (!(other instanceof TraditionalPerson)) {
      return false; //e.g. person1.equals("Safwan");
    }
    TraditionalPerson otherPerson = (TraditionalPerson) other;
    return this.getName().equals(otherPerson.getName())
        && this.getAddress().equals(otherPerson.getAddress());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getName(), getAddress());
  }


  @Override
  public String toString() {
    return "TraditionalPerson{" +
        "name='" + name + '\'' +
        ", address='" + address + '\'' +
        '}';
  }
}
