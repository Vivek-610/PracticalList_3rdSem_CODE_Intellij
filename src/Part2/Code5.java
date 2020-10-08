package Part2;
class MethodOverloading{
    void sumMethod(int a,int b){
        System.out.println("Sum is :" + (a+b));
    }
    void sumMethod(double a,double b){
        System.out.println("Sum is :" + (a+b));
    }
    void sumMethod(int a,int b,int c){
        System.out.println("Sum is :" + (a+b+c));
    }
    void sumMethod(String a,String b){
        System.out.println("After concatinating :" + a + b );
        System.out.println();
    }
    
}
public class Code5 {
    public static void main(String args[]){
        MethodOverloading obj = new MethodOverloading();
        System.out.println();
        int i1 = 10;
        int i2 = 30;
        obj.sumMethod(i1,i2); 

        System.out.println();
        int i3=100;
        obj.sumMethod(i1, i2, i3); 

        System.out.println();
        double d1 = 20;
        double d2 = 40;
        obj.sumMethod(d1,d2); 

        System.out.println();
        String str1 = "Hello", str2=" world";
        obj.sumMethod(str1,str2);
        System.out.println("Coded By Vivek D Kapadia\n19CE055");

    }
}
