package Part3;

interface Vehicle {

  String getBrand();

  String speedUp();

  String slowDown();

  default String turnAlarmOn() {
    return "Turning the vehicle alarm on.";
  }

  default String turnAlarmOff() {
    return "Turning the vehicle alarm off.";
  }
}

class Car implements Vehicle {
  String brand;

  public Car(String s1) {
    brand = s1;
  }

  public String getBrand() {
    return brand;
  }

  public String speedUp() {
    return "The car is speeding up.";
  }

  public String slowDown() {
    return "The car is slowing down.";
  }
}

public class Code7 {
  public static void main(String[] args) {
    Car c1 = new Car("AUDI");
    System.out.println(c1.getBrand());
    System.out.println(c1.speedUp());
    System.out.println(c1.slowDown());
    System.out.println(c1.turnAlarmOn());
    System.out.println(c1.turnAlarmOff());
    System.out.println("Prepared by VIVEK KAPADIA 19CE055.");
  }

}
