package Ca3_Operators;
public class Ca3_3_MultiplyAndDivide {
  public static void main(String[] args) {   
		double subtotal = 30;
    double tax = 0.0875;

    double total = subtotal * (tax + 1);
    System.out.println(total);

    double perPerson = total / 4;
    System.out.println(perPerson);
	}
}
