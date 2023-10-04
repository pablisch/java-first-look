package Ca5_Methods;

public class Store5 {
  // instance fields
  String productType;
  double price;
  
  // constructor method
  public Store5(String product, double initialPrice) {
    productType = product;
    price = initialPrice;
  }
  
  // increase price method
  public void increasePrice(double priceToAdd){
    double newPrice = price + priceToAdd;
    price = newPrice;
  }
  
  // main method
  public static void main(String[] args) {
    Store5 lemonadeStand = new Store5("Lemonade", 3.75);
    lemonadeStand.increasePrice(1.5);
    System.out.println(lemonadeStand.price);
  }
}

// Calling a method from the main method and printing the resulting change in price.
// The increasePrice() method takes a parameter of type double called priceToAdd.
// The increasePrice() method adds the parameter priceToAdd to the price field.