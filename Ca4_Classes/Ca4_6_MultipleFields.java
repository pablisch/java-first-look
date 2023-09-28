package Ca4_Classes;
public class Ca4_6_MultipleFields {
  // instance fields
  String productType;
  int inventoryCount;
  double inventoryPrice;

  // constructor method
  public Ca4_6_MultipleFields(String product, int count, double price) {
    productType = product;
    inventoryCount = count;
    inventoryPrice = price;
  }

  // main method
  public static void main(String[] args) {
    Ca4_6_MultipleFields cookieShop = new Ca4_6_MultipleFields("cookies", 12, 3.75);
    System.out.println(cookieShop.productType);
    System.out.println(cookieShop.inventoryCount);
    System.out.println(cookieShop.inventoryPrice);
  }
}

// There are no new concepts in this exercise. It just shows multple instance fields being declared and assigned values.
