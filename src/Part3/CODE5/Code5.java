package Part3.CODE5;
import PackageforCode5.Calculator;
import java.util.Scanner;

public class Code5 {
  public static void main(String[] args) {
    Calculator c1 = new Calculator();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter two numbers for calculation.");
    float x, y, ans;
    x = sc.nextFloat();
    y = sc.nextFloat();
    int a;

    System.out.println("Press '1' for addition.'2' for Multiplication.");
    System.out.print("'3' for Subtraction.'4' for Division.");
    a = sc.nextInt();

    switch (a) {
      case 1:
        ans = c1.Add(x, y);
        System.out.println("X+Y=" + ans);
        break;
      case 2:
        ans = c1.Multiply(x, y);
        System.out.println("X+Y=" + ans);
        break;
      case 3:
        ans = c1.Subtract(x, y);
        System.out.println("X+Y=" + ans);
        break;
      case 4:
        ans = c1.Divide(x, y);
        System.out.println("X+Y=" + ans);
        break;

    }
    System.out.println("Prepared by VIVEK KAPADIA 19CE055.");
    sc.close();
  }
}
