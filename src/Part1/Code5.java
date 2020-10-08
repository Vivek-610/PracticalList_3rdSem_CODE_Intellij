package Part1;
import java.util.Scanner;

class Recursive
{
    static int n=0;
    int recursive(int a)
    {
        if(a==0){
        return n;}
        else if(a==1){
        return 1;}
        n = a + recursive(a-1);
        return n;
    }
}
public class Code5
{
    public static void main(String[] args)
    {
        Recursive obj=new Recursive();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number : ");
        int b=sc.nextInt();
        int out=obj.recursive(b);
        System.out.println("triangle("+b+")->"+out);
        System.out.println("Prepared by - Vivek D Kapadia");
        System.out.println("19CE055");
        sc.close();
    }
}
