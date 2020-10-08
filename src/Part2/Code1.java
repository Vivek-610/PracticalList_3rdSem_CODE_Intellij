package Part2;

class Cylinder{
    private double raduis =1;
    private double height=1;
    Cylinder(){
        raduis = 1d;
        height = 1d;
    }
    Cylinder(double raduis){
        this.raduis = raduis;
    }
    Cylinder(double raduis,double height){
        this.raduis = raduis;
        this.height = height;
    }
    void display(){
        System.out.println("radius : "+raduis);
        System.out.println("height : "+height);
    }
    double getArea(){
        return (double)(3.14 * raduis * raduis);
    }
}
public class Code1 { //class testCylinder according to the question
    public static void main(String args[]){
        System.out.println("----------------No argument constructer--------------");
        Cylinder a1 = new Cylinder();
        a1.display();
        System.out.println("Area of the cylinder is : " + String.format("%.3f",a1.getArea()));

        System.out.println("----------------one argument constructer-------------");
        a1= new Cylinder(19d);
        a1.display();
        System.out.println("Area of the cylinder is : " + String.format("%.3f",a1.getArea()));

        System.out.println("----------------two argument constructer--------------");
        a1 = new Cylinder(12d,4d);
        a1.display();
        System.out.println("Area of the cylinder is : " + String.format("%.3f",a1.getArea()));

        System.out.println("Coded by - Vivek D Kapadia");
        System.out.println("19CE055");
    }
}
