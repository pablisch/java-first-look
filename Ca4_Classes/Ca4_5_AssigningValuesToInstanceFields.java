package Ca4_Classes;
public class Ca4_5_AssigningValuesToInstanceFields {
  // instance fields
  String productType;

  // constructor method
  public Ca4_5_AssigningValuesToInstanceFields(String product) {
    productType = product;
  }

  // main method
  public static void main(String[] args) {
    Ca4_5_AssigningValuesToInstanceFields lemonadeStand = new Ca4_5_AssigningValuesToInstanceFields("lemonade");
    System.out.println(lemonadeStand.productType);
  }
}

// This exercise introduces the concept of assigning values to instance fields.

// When we create a new instance of a class and pass in arguments, those arguments are called parameters.
// The values that are passed in as parameters are assigned to the corresponding instance fields.
// In this example, we create an instance of Store called lemonadeStand which has a productType of "lemonade".
// We have printed out the productType by calling lemonadeStand.productType.
