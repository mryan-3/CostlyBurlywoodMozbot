// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

import java.util.Scanner;


class Animal {
    public void eat() {
      System.out.println("Animal is eating");
    }  
  }
class Pig extends Animal{
  public void eat () {
    System.out.println("Pig is eating");
  }
}
public class Main {
  
  public static void main(String[] args) {  
    Animal myAnimal = new Animal();
    Animal myPig = new Pig();
    myPig.eat();
    myAnimal.eat();
} 
 
}