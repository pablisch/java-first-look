package Ca5_Methods;

public class Store4 {
  // instance fields
  String productType;

  // constructor method
  public Store4(String product) {
    productType = product;
  }

  // advertise method
  public void advertise() {
    String message = "Selling " + productType + "!";
    System.out.println(message);
  }

  // greetCustomer method
  public void greetCustomer(String customer) {
    System.out.println("Welcome to the store, " + customer + "!");
  }

  // main method
  public static void main(String[] args) {
    Store4 lemonadeStand = new Store4("Lemonade");
    lemonadeStand.greetCustomer("Pablo");
  }
}

// This exercise introduces parameters to customers methods.
// The custom method greetCustomer() takes a parameter of type String called customer. 
// The greetCustomer() method is called inside the main() method with the argument "Pablo".
