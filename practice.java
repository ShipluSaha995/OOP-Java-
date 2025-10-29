/*Implement multiple inheritanece. 3 classes A,B,C and Class C inherits both A and B

interface A{
    void code();
}

interface B{
    void language();
}

class C implements A, B{
    public void code(){
        System.out.println("code with");
    }

    public void language(){
        System.out.println("Java");
    }
}

public class practice{
    public static void main(String[] args) {
        C java = new C();
        java.code();
        java.language();
    }

}
*/

//Try various combination of public, private, protected in the given code and verify if it satisfies the table in table 1
/* 
class A{
    public int pub=10;
    private int pri=20;
    protected int pro=30;
    int var=40;  

    public void publicMethod(){
        System.out.println("public");
    }

    private void privateMethod(){
        System.out.println("private");
    }

    protected void protectedMethod(){
        System.out.println("Protected");
    }

    public void de(){    
        System.out.println(pri);
    }
}

class B{
    public int pub2=100;
    private int pri2=200;
    protected int pro2=300;

    public void publicMethod2(){
        System.out.println("public 2");
    }

    private void privateMethod2(){
        System.out.println("private 2");
    }

    protected void protectedMethod2(){
        System.out.println("Protected 2");
    } 

    public void showPrivateB() { 
        System.out.println(pri2);
        privateMethod2();  
    }
}

class C extends A {
    B b = new B();
    public void Members(){
        System.out.println(pub);        //accessible (public)
     //  ERROR (private)
        System.out.println(pro);       // protected, accessible in subclass
        System.out.println(var);       //  default, same package

        de();                          //  accesses A's private via public method

        System.out.println(b.pub2);    // public
        
        // if in same package (yes, here they are)
        b.protectedMethod2();         //  accessible (same package)
        b.showPrivateB();             //  accesses private of B internally
    }
}

public class practice{
    public static void main(String[] args) {
        C c = new C();
        c.Members();

        System.out.println("Access A's public var: " + c.pub);
        c.publicMethod();
    }
}

*/
//Polymorphism

/* Write a java problem that will creat a class "Shape" from which you can creat two objects like 
 "Rectangle" and Square. add following:
 
 1. Determine the attributes of both objects according to your choice (length and breadth)
 2. Initialize a Parimeterized constructor for both objects, that will recive the value of (length)
 and (length, breadth) from main() function
 3. Declare two overloading methods "CalculateArea()" and two overloading methods "CalculateParimeter()"
 in the Shape class. Return the calculated area and peremeter in main() function for both Square and 
 Rectangle, with the help of a object and point the values.

 */

 import java.util.Scanner;
 class Shape{
    double CalculateArea(double side){
        return side*side;
    }

    double CalculateArea(double length, double breadth){
        return length*breadth;
    }

    double CalculateParimeter(double side){
        return 4*side;
    }

    double CalculateParimeter(double length, double breadth){
        return 2*(length+breadth);
    }
 }

 class Square extends Shape{
    private double side;

    public void setSide(double side){
        this.side=side;
    }
    public double getSide(){
        return side;
    }

    void displaySqaure(){
        System.out.println("Square"+"\n"+"side: "+ getSide());
        System.out.println("Area of the Square= "+CalculateArea(getSide()));
        System.out.println("Parimeter= "+CalculateParimeter(getSide()));
    }

 }

 class Rectangle extends Shape{
    private double length;
    private double breadth;

    public void setLength(double length){
        this.length=length;
    }

    public double getLength(){
        return length;
    }

    public void setBreadth(double breadth){
        this.breadth=breadth;
    }

    public double getBreadth(){
        return breadth;
    }

    void displayRectangle(){
    
        System.out.println("Rectangle"+"\n"+"length: "+ getLength()+"\n"+"Breadth: "+getBreadth());
        System.out.println("Area of the Rectangle= "+CalculateArea(getLength(), getBreadth())); 
        System.out.println("Paramiter= "+CalculateParimeter(getLength(), getBreadth()));      
        

    }
 }

 public class practice{
    public static void main(String[] args) {
        java.util.Scanner sc = new Scanner(System.in);

        Square s = new Square();
        System.out.print("Enter side: ");
        double side=sc.nextDouble();
        s.setSide(side);

        s.displaySqaure();

        Rectangle r = new Rectangle();
        System.out.print("Enter lenght: ");
        double length= sc.nextDouble();
        System.out.print("Enter Breadth: ");
        double breadth= sc.nextDouble();

        r.setLength(length);
        r.setBreadth(breadth);
        r.displayRectangle();
    }
 }

 