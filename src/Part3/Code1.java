import java.util.Date;
import java.util.Scanner;
abstract class GeometricObject{
    String color;
    boolean filled;
    Date dateCreated;
    protected GeometricObject(){
        System.out.println("--------------------No arg constructer----------------------");
        color = "Black";
        filled = false;
        dateCreated = new Date();
    }
    protected GeometricObject(String color,boolean filled){
        System.out.println("-----------------------arg constructer----------------------");
        this.color=color;
        this.filled = filled;
        dateCreated = new Date();
    }
    String getColor(){
        return color;
    }
    void setColor(String color){
        this.color = color;
    }
    boolean isFilled(){
        return filled;
    }
    void setFilled(boolean filled){
        this.filled = filled ;
    }
    Date getDateCreated(){
        return dateCreated;
    }
    @Override
    public String toString(){
        return "Object color : "+ color +"\nFilled :"+filled+"\nCreated on :"+dateCreated;
    }
    abstract double getArea();
    abstract double getPerimeter();
}
class Circle extends GeometricObject{
    double radius;
    Circle(){
        radius = 0;
    }
    Circle(double radius){
        this.radius = radius;
    }
    Circle(double radius,String color,boolean filled){
        super(color,filled);
        this.radius = radius;
    }
    double getRaduis(){
        return radius;
    }
    double getDiameter(){
        return 2*radius;
    }
    void setRaduis(double radius){
        this.radius = radius;
    }

    double getArea(){
        return 3.14*radius*radius;
    }
    double getPerimeter(){
        return 2*3.14*radius;
    }
}
class Rectangle extends GeometricObject{
    double height;
    double width;
    Rectangle(){
        height = 0;
        width = 0;
    }
    Rectangle(double height,double width,String color,boolean filled){
        super(color,filled);
        this.height = height;
        this.width = width;
    }
    double getArea(){
        return height*width;
    }
    double getPerimeter(){
        return 2*(height+width);
    }
    double getWidth(){
        return width;
    }
    double getHeight(){
        return height;
    }
    void setHeight(double height){
        this.height=height;
    }
    void setWidth(double width){
        this.width = width;
    }

}
public class Code1 { //class TestGeometricObject
    public static void main(String args[]){
        boolean f=true;
        String str = "";
        //------------------------------------------------------------------------------------//
        System.out.println();
        System.out.println("//------------------------CIRCLE------------------------//");
        System.out.println();
        Circle c1 = new Circle();
        if(f == c1.isFilled()) str = " filled ";
        else str=" not filled ";
        System.out.println("Area of "+c1.getColor()+str+"circle is :"+c1.getArea());
        System.out.println("perimeter of circle :"+c1.getPerimeter());
        //------------------------------------------------------------------------------------//
        c1 = new Circle(10,"Red",true);
        if(f == c1.isFilled()) str = " filled ";
        else str=" not filled ";
        System.out.println("Area of "+c1.getColor()+str+"circle is :"+c1.getArea());
        System.out.println("perimeter of circle is :"+String.format("%.3f",c1.getPerimeter()));
        //------------------------------------------------------------------------------------//
        System.out.println("-----------------using getter and setter methods------------");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter raduis of the Circle :");
        double r=sc.nextDouble();
        c1.setRaduis(r);
        System.out.println("Area of "+c1.getColor()+str+"circle is :"+c1.getArea());
        System.out.println("perimeter of circle is :"+String.format("%.3f",c1.getPerimeter()));

        //------------------------------------------------------------------------------------//
        System.out.println();
        System.out.println("//------------------------RECTANGLE------------------------//");
        System.out.println();
        Rectangle r1 = new Rectangle();
        if(f == r1.isFilled()) str = " filled ";
        else str=" not filled ";
        System.out.println("Area of "+r1.getColor()+str+"rectangle is :"+r1.getArea());
        System.out.println("perimeter of rectangle is :"+String.format("%.3f",r1.getPerimeter()));
        //------------------------------------------------------------------------------------//
        r1 = new Rectangle(2,5,"Pink",true);
        if(f == r1.isFilled()) str = " filled ";
        else str=" not filled ";
        System.out.println("Area of "+r1.getColor()+str+"rectangle is :"+r1.getArea());
        System.out.println("perimeter of rectangle is :"+String.format("%.3f",r1.getPerimeter()));
        //------------------------------------------------------------------------------------//
        System.out.println("-----------------using getter and setter methods------------");
        System.out.print("Enter width of the Rectangle :");
        double w=sc.nextDouble();
        System.out.print("Enter height of the Rectangle :");
        double h=sc.nextDouble();
        r1.setWidth(w);
        r1.setHeight(h);
        System.out.println("Area of "+r1.getColor()+str+"rectangle is :"+r1.getArea());
        System.out.println("perimeter of rectangle is :"+String.format("%.3f",r1.getPerimeter()));
        System.out.println("Coded by Vivek D Kapadia\n19CE055");
        sc.close();
    }
}