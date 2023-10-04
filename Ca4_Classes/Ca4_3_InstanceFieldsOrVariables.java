package Ca4_Classes;
// should be called, and about, Store. Wherever it says Ca4_3_InstanceFieldsOrVariables, it should say Store.

public class Ca4_3_InstanceFieldsOrVariables {

  // declare instance fields here!
  String productType;

  // constructor method
  public Ca4_3_InstanceFieldsOrVariables() {
    System.out.println("I am inside the constructor method.");
  }

  // main method is where we create instances!
  public static void main(String[] args) {
    System.out.println("Start of the main method.");

    // create the instance below
    Ca4_3_InstanceFieldsOrVariables lemonadeStand = new Ca4_3_InstanceFieldsOrVariables();
    // print the instance below
    System.out.println(lemonadeStand);
  }
}

// This exercise introdues the concept of instance fields as on line 7

