package Ca5_Methods;

public class Store7 {
  // instance fields
  String productType;
  double price;
  
  // constructor method
  public Store7(String product, double initialPrice) {
    productType = product;
    price = initialPrice;
  }
  
  // increase price method
  public void increasePrice(double priceToAdd){
    double newPrice = price + priceToAdd;
    price = newPrice;
  }
  
  // get price with tax method
  public double getPriceWithTax(){
    double tax = 0.08;
    double totalPrice = price + price*tax;
    return totalPrice;
  }

  // main method
  public static void main(String[] args) {
    Store7 lemonadeStand = new Store7("Lemonade", 3.75);
    Store7 cookieShop = new Store7("Cookies", 5);
    System.out.println(lemonadeStand);
    System.out.println(cookieShop);
  }

  // toString method
  public String toString(){
    return "This store sells " + productType + " at a price of " + price + ".";
  }
}

// This exercise introduces the toString() method.
// Although the CA tutorial does not mention it, the toString() method is a method that is automatically called when an object is printed.
// By inlcuding our own toString() method we overide the default behaviour and can control what is printed when an object is printed.
// Without a custom toString() method, the default behaviour is to print the name of the class and the memory address of the object, e.g. Ca5_Methods.Store7@15db9742, which is not very useful, informative or descriptive.