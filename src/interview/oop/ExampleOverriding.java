package interview.oop;

class MathOperations {

  // Method to add two integers
  public int add(int a, int b) {
    return a + b;
  }

  // Overloaded method to add three integers
  public int add(int a, int b, int c) {
    return a + b + c;
  }

  // Overloaded method to add two double values
  public double add(double a, double b) {
    return a + b;
  }
}


public class ExampleOverriding {

  public static void main(String[] args) {
    MathOperations mathOps = new MathOperations();
    System.out.println(
        "Addition of two integers: " + mathOps.add(5, 10));         // Calls add(int, int)
    System.out.println(
        "Addition of three integers: " + mathOps.add(5, 10, 15));   // Calls add(int, int, int)
    System.out.println(
        "Addition of two doubles: " + mathOps.add(5.5, 10.5));      // Calls add(double, double)
  }
}
