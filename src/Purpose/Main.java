package Purpose;

public class Main {

  public static void main(String[] args) {
    Person person1 = new Person("Safwan", "Scheideholzweg 24");
    Person person2 = Person.unknownPerson();
    System.out.println(person1.greeting());
  }
}
