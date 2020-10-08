package Part1;
import java.util.Scanner;

public class Code3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        System.out.println("1st number - ");
        int a = sc.nextInt();
        System.out.println("2nd number - ");
        int b = sc.nextInt();
        int f1 = a;
        int f2 = b;
        int temp = a;
        while (temp != 0) {
            f1 = temp % 10;
            temp = temp / 10;
        }
        temp = f2;
        while (temp != 0) {
            f2 = temp % 10;
            temp = temp / 10;
        }
        if (f1 == f2) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        System.out.println("Coded by Vivek D Kapadia");
        System.out.println("19CE055");
        sc.close();
    }
}
