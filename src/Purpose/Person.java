package Purpose;

public record Person(String name, String address) {

  // Compact constructor for validation
  public  Person{
    if(name.isEmpty() || name.isBlank() || name == null ) {
      throw  new IllegalArgumentException("Name cannot be null or blank");
    }

    if(address.isEmpty() || address.isBlank() || address == null ) {
      throw  new IllegalArgumentException("Address cannot be null or blank");
    }
  }

  // static attributes
  public  static final String UNKNOWN = "Unknown";

  // static methods : factory method
  public  static Person unknownPerson(){
    return new Person(UNKNOWN, UNKNOWN);
  }

  // Additional instance methods can be added

  public  String greeting(){
    return "Hello, my name is "+name+"\n and I live at "+address;
  }

}
