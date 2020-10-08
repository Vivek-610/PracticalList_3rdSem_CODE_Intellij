package Part3;
import java.util.Scanner;

interface Luminious_object {
  void light_on();

  void light_off();
}

class Solid {
}

class Cube extends Solid {
  void show() {
    System.out.println("This is the solid named cube.");
  }

}

class Cone extends Solid {
  void print() {
    System.out.println("This is the solid named Cone.");
  }
}

class Luminious_Cone extends Cone implements Luminious_object {
  public void light_on() {
    System.out.println("This is luminious Cone.");
  }

  public void light_off() {
    System.out.println("This is not a luminious Cone.");
  }
}

class Luminious_Cube extends Cube implements Luminious_object {
  public void light_on() {
    System.out.println("This is luminious Cube.");
  }

  public void light_off() {
    System.out.println("This is not a luminious Cube.");
  }
}

public class Code2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Luminious_Cone c1 = new Luminious_Cone();
    Luminious_Cube c2 = new Luminious_Cube();
    c1.print();
    c2.show();
    System.out.println("Is the lights on? Enter'y' for yes and 'n'for no.");
    char w;
    w = sc.next().charAt(0);
    switch (w) {
      case 'y':
        c1.light_on();
        c2.light_on();
        break;
      case 'Y':
        c1.light_on();
        c2.light_on();
        break;
      case 'n':
        c1.light_off();
        c2.light_off();
        break;
      case 'N':
        c1.light_off();
        c2.light_off();
        break;
    }
    System.out.println("Prepared by VIVEK KAPADIA 19CE055.");
    sc.close();
  }

}
