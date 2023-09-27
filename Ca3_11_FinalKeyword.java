public class Ca3_11_FinalKeyword {
  public static void main(String[] args) { 
    final double pi = 3.14;
    System.out.println(pi);

    // pi = 3.142;
    // the commented line above will produce an error if uncommented since you cannot change the value of a variable prepended with 'final'.
}
}
