package Part3.PackageforCode6;

import java.util.Scanner;

public class Fruits {
  String colour, shape, taste;

  public void get() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the colour of fruit:");
    colour = sc.next();
    System.out.print("Enter the shape of fruit:");
    shape = sc.next();
    System.out.print("Enter the taste of fruit:");
    taste = sc.next();
  }

  public void put() {
    System.out.println("Colour of fruit is :" + colour);
    System.out.println("Shape of fruit is :" + shape);
    System.out.println("Taste of fruit is :" + taste);
  }

}

