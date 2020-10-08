package Part3;

interface P
{
    void print();
    int a=10;
}
interface P1 extends P
{
  void print2();
  int a1=15;

}
interface P2 extends P
{
void print3();
int a3=20;


}
interface P12 extends P1,P2
{
    void print4();
    int a4=25;
}
class Test implements P12
{
public void print()
{
System.out.println("Inside interface P.Value of a="+a);
}
public void print2()
{
System.out.println("Inside interface P1.Value of a="+a1);
}
public void print3()
{
System.out.println("Inside interface P2.Value of a="+a3);
}
public void print4()
{
System.out.println("Inside interface P.Value of a="+a4);
}
}
public class Code3 {  
    public static void main(String[] args) {
        
        Test t1=new Test();
        t1.print();
        t1.print2();
        t1.print3();
        t1.print4();
        System.out.println("Prepared by VIVEK KAPADIA 19CE055.");
        
    }
    
}
