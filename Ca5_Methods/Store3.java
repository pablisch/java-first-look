package Ca5_Methods;

public class Store3 {
  // instance fields
  String productType;

  // constructor method
  public Store3(String product) {
    productType = product;
  }

  // advertise method
  public void advertise() {
    String message = "Selling " + productType + "!";
    System.out.println(message);
  }

  // main method
  public static void main(String[] args) {
    String cookie = "Cookies";
    Store3 cookieShop = new Store3(cookie);

    // System.out.println(message);
    cookieShop.advertise();
  }
}

// The printout code on line 23 would not work and throw an error because the the variable 'message' is not in the scope of the main method. It is only in the scope of the advertise method.

