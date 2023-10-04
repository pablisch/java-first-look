package Ca5_Methods;

public class Store1 {
  // instance fields
  String productType;

  // constructor method
  public Store1(String product) {
    productType = product;
  }

  // advertise method
  public void advertise() {
    System.out.println("Come spend some money!");
    System.out.println("Selling " + productType + "!");
  }

  // main method
  public static void main(String[] args) {

  }
}

// This exercise introduces the concept of methods in java beyond the main method.
