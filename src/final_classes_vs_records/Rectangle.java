package final_classes_vs_records;

// classes declared with final 'keyword' : means the class CAN NOT BE EXTENDED
public final class Rectangle {
private double length;
private double width;
private final String category= "A"; // fields declared with final 'keyword': means they're constants

// Rest of the body


  public Rectangle(double length, double width) {
    this.length = length;
    this.width = width;
  }


  public double getLength() {
    return length;
  }

  public void setLength(double length) {
    this.length = length;
  }

  public double getWidth() {
    return width;
  }

  public void setWidth(double width) {
    this.width = width;
  }

  public final double calculateArea(){ // methods declared with final 'keyword': means the method can not be @Override
    return length*width;
  }

}
