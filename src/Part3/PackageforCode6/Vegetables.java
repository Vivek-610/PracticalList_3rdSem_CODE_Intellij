package Part3.PackageforCode6;

import java.util.Scanner;

public class Vegetables {
  String colour, shape, taste;

  public void get() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the colour of vegetable:");
    colour = sc.nextLine();
    System.out.print("Enter the shape of vegetable:");
    shape = sc.nextLine();
    System.out.print("Enter the taste of vegetable:");
    taste = sc.nextLine();
  }

  public void put() {
    System.out.println("Colour of vegetable is :" + colour);
    System.out.println("Shape of vegetable is :" + shape);
    System.out.println("Taste of vegetable is :" + taste);
  }
}