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

 /*import java.util.Scanner;
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

 public class Practice{
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

 */

 //Thread

 /*import java.lang.Thread;

 class MyThread extends Thread{
    @Override
    public void run(){
        System.out.println("Runnig thread");
    }

 }

 public class Practice{
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
    }
 }*/

/*import java.lang.Thread;
class MyThread implements Runnable{
    public void run(){
        System.out.println("Running Thread");
    }

}

public class Practice{
    public static void main(String[] args) {
        MyThread M =new MyThread();
        Thread T= new Thread(M);
        T.start();
    }
}*/

//sleep alive
/*import java.lang.Thread;
class MyThread extends Thread{
    public void run(){
        try{
            System.out.println("Threade Sleeping.");
            Thread.sleep(200);
            System.out.println("Thread awake.");
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}

public class Practice{
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
        System.out.println("is threade alive: "+ t.isAlive());

    }
}*/

//join
/*import java.lang.Thread;
class MyThread extends Thread{
    public void run(){
        System.out.println(getName()+" is running.");
    }
}

public class Practice{
    public static void main(String[] args) throws InterruptedException{

        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        System.out.println("Both thread have finished their execution.");
    }
}*/

//max_priority and min_priority
/*import java.lang.Thread;
class MyThread extends Thread{
    public void run(){
        System.out.println(getName()+" With priority "+getPriority()+" is running");
    }
}

public class Practice{
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
    }
}*/

//Synchronization
/*import java.lang.Thread;
class Counter{
    int count =0;
    synchronized void increment(){
        count++;
        System.out.println("Count: "+count);
    }
}

class Test extends Thread{
    Counter c;
    Test(Counter c){
        this.c=c;
    }

    public void run(){
        c.increment();
    }
}

public class Practice{
    public static void main(String[] args) {
        Counter Obj = new Counter();
        Test t1 = new Test(Obj);
        Test t2 = new Test(Obj);

        t1.start();
        t2.start();
    }
}*/

/*import java.lang.Thread;
class Table{
    synchronized void print(int n){
        for(int i=1; i<=10; i++){
            System.out.println(n*i);
        }
    }
}

class MyThread extends Thread{
    Table t;
    MyThread(Table t){
        this.t=t;
    }
    public void run(){
        t.print(5);
    }
}

public class Practice{
    public static void main(String[] args) {
        Table obj = new Table();
        MyThread t1 = new MyThread(obj);
        MyThread t2 = new MyThread(obj);

        t1.start();
        t2.start();
    }
    
}*/

//synchronized block
/*import java.lang.Thread;

class Counter{
    int count =0;
    void increment(){
        synchronized (this) {
            count++;
            System.out.println("Count: "+count);
        }
       
    }
}

class Test extends Thread{
    Counter c;
    Test(Counter c){
        this.c=c;
    }

    public void run(){
        c.increment();
    }
}

public class Practice{
    public static void main(String[] args) {
        Counter Obj = new Counter();
        Test t1 = new Test(Obj);
        Test t2 = new Test(Obj);

        t1.start();
        t2.start();
    }
}*/

//static Synchronization

import java.lang.Thread;

class Counter{
    static int count =0;
    static synchronized  void increment(){
        
        count++;
        System.out.println("Count: "+count);
    
       
    }
}

class Test extends Thread{
    Counter c;
    Test(Counter c){
        this.c=c;
    }

    public void run(){
        c.increment();
    }
}

public class Practice{
    public static void main(String[] args) {
        Counter Obj = new Counter();
        Test t1 = new Test(Obj);
        Test t2 = new Test(Obj);

        t1.start();
        t2.start();
    }
}