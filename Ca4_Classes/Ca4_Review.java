package Ca4_Classes;
public class Ca4_Review {
  String breed;
  boolean hasOwner;
  int age;
  String ownerName;

  public Ca4_Review(String Ca4_ReviewBreed, boolean Ca4_ReviewOwned, int Ca4_ReviewYears, String Ca4_ReviewOwnerName) {
    System.out.println("Constructor invoked!");
    breed = Ca4_ReviewBreed;
    hasOwner = Ca4_ReviewOwned;
    age = Ca4_ReviewYears;
    ownerName = Ca4_ReviewOwnerName;
  }

  public static void main(String[] args) {
    System.out.println("Main method started");
    Ca4_Review fido = new Ca4_Review("poodle", false, 4, "Ed");
    Ca4_Review nunzio = new Ca4_Review("shiba inu", true, 12, "Sophie");
    boolean isFidoOlder = fido.age > nunzio.age;
    int totalCa4_ReviewYears = nunzio.age + fido.age;
    System.out.println("Two Ca4_Reviews created: a " + fido.breed + " and a " + nunzio.breed);
    System.out.println("The statement that fido is an older Ca4_Review is: " + isFidoOlder);
    System.out.println("The total age of the Ca4_Reviews is: " + totalCa4_ReviewYears);
    System.out.println("Main method finished");
    System.out.println("Fido is owned by " + fido.ownerName + " and Nunzio is owned by " + nunzio.ownerName + ".");
  }
}

// This review is a combination of the Ca4_ exercises which detail how to create a class, instantiate an object, and assign values to instance fields.
