package interview.oop;

class Animal {

  // Method to make a sound
  public void makeSound() {
    System.out.println("Animal makes a sound");
  }
}

class Dog extends Animal {

  @Override
  public void makeSound() {
    System.out.println("Dog barks");
  }

  public int countExample(int a, int b) {
    return a + b;
  }

  public int countExample(int a, int b, int c) {
    return a + b + c;
  }
}

public class ExampleOverloading {

  public static void main(String[] args) {
    Animal myAnimal = new Animal();
    Dog actualDog = new Dog();

    myAnimal.makeSound();
    actualDog.makeSound();
    System.out.println(actualDog.countExample(1, 2));       // Outputs: 3
    System.out.println(actualDog.countExample(1, 2, 3));    // Outputs: 6
  }
}
