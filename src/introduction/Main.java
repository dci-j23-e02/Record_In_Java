package introduction;

public class Main {

  public static void main(String[] args) {
    TraditionalPerson person1 = new TraditionalPerson("Safwan", "Germany");
    TraditionalPerson person2 = new TraditionalPerson("Safwan", "Germany");

    String name = "Safwan";

   //  boolean result = person1.equals("Safwan");
   //  System.out.println(result);

   // System.out.println((Object) name instanceof String );

    System.out.println(person1);


    Person personA = new Person("Harry", "UK");
    Person personB = new Person("Harry", "UK");
    boolean result = personA.equals(personB);
    System.out.println(result);
    System.out.println(personB);


  }
}
