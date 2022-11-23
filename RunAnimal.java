package abstraction;

import java.util.Scanner;
public class RunAnimal {

 public static void main(String[] args) {
  Scanner Mm = new Scanner(System.in);
      
  System.out.print("Choose animal. Press fB for Bird, C for Cat, or D for Dog: ");
  String s = Mm.nextLine();
  
   if (s.equalsIgnoreCase("B"))
  {
  Bird b = new Bird();
  b.eat();
  b.sleep();
  b.makeSound();
  }
  else if (s.equalsIgnoreCase("C"))
  {
  Cat c = new Cat();
  c.eat();
  c.sleep();
  c.makeSound();
  }
  else if(s.equalsIgnoreCase("D"))
  {
  Dog d = new Dog();
  d.eat();
  d.sleep();
  d.makeSound();
  } 
 }
}