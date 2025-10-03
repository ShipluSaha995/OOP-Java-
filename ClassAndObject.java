
//class
// class Car{
//     String brand;
//     int year;

//     void display(){
//         System.out.println("Brand= "+brand+", Year= "+year);
//     }
// }

// public class Main {
//     public static void ClassAndObject(String[] args){
//         Car my_car =new Car();
//         my_car.brand="Marcidise";
//         my_car.year=2035;
//         my_car.display();
//     }
// }


//Method

// class Car{
//     String brand;
//     int year;
//     //constractor Method
//     Car(String b, int y){
//         brand=b;
//         year=y;
//     }
//     //Instace method
//     void display(){
//         System.out.println("Brand: "+brand+", year: "+year);
//     }
//     //Static Method
//     static void company(){
//         System.out.println("The car company is : Mercedes");
//     }
// }

// public class Main {

//     public static void ClassAndObject(String[] args) {
//         Car car=new Car("Mercedes", 2035);
//         car.display();
//         Car.company();
//     }
// }


//Method and Object
/*import java.util.Scanner;

class Car{
    String brand;
    int year;

    //constractor Method
    Car(String b, int y){
        brand=b;
        year=y;
    }

    //Instance Method
    void display(){
        System.out.println("Brand: "+brand+", Year: "+year);
    }

    //Static Method
    static void company(){
        System.out.println("The car company is Mercedes.");
    }
}

public class {

    public static void ClassAndObject(String[] args) {
        Scanner sc=new Scanner(System.in); //object_1
        System.out.print("Enter car brand: ");
        String brand=sc.nextLine();
        System.out.print("Enter year: ");
        int year=sc.nextInt();
        Car car1= new Car(brand, year); //Object_2

        car1.display();
        Car.company();

        sc.close();
    }

} */

//object

/* 
import java.util.Scanner;
class Car{
    String brand;
    int year;

    Car(String b, int y){
        brand=b;
        year=y;
    }
    void display(){
        System.out.println("Brand: "+brand+", year: "+year);
    }
}

public class ClassAndObject{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter car brand: ");
        String brand=sc.nextLine();
        System.out.print("Enter year: ");
        int year=sc.nextInt();

        Car car1 = new Car(brand, year); //object
        car1.display();
        
        sc.close();
    }
  
}

*/

//Object initialization(Direct Assignment):
//1. by Reference
/* 
class Car{
    String brand;
    int year;
}

public class ClassAndObject{
    public static void main(String[] args) {
        Car car1= new Car(); //created an Object

        // Initializing attributes directly
        car1.brand="Mercedes";
        car1.year=2035;

        System.out.println("The Car name: "+car1.brand+"\nYear: "+car1.year);
    }
}
*/

//2. by Constrructor

/* 
class Car{
    String brand;
    int year;

    //Constructor
    Car(String b, int y){
        brand=b;
        year=y;
    }

    void display(){
        System.out.println("Brand: "+brand+"\nYear: "+year);
    }
}

public class ClassAndObject{
    public static void main(String[] args) {
        
        //Object initialization via constructor
        Car car1= new Car("Mercedes", 2035);
        Car car2= new Car("Audi", 2036);
        car1.display();
        car2.display();
    }
}
*/

//3.by method
/* 
class Car{
    String brand;
    int year;

    void SetValues(String b, int y){
        brand=b;
        year=y;
    }

    void display(){
        System.out.println("Car: "+brand+"\nYear: "+year);
    }
}

public class ClassAndObject{
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.SetValues("Mercedes", 2035);
        car1.display();
    }

}
*/


//practice
/*import java.util.Scanner;
class Student{
    String name;
    int id;
    String dep;

    //constructor
    Student(String n, int i, String de ){
        name=n;
        id=i;
        dep=de;
    }

    void dispaly(){
        System.out.println("Name: "+name+"\nID: "+id+"\nDepartment: "+dep);
    }
}

public class ClassAndObject{ 
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name= sc.nextLine();
        System.out.print("Enter id: ");
        int id= sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Department: ");
        String dep= sc.nextLine();

        //Object initialization via constructor
        Student stud = new Student(name, id, dep);
        stud.dispaly();
        sc.close();
    }
}

*/

//types of constructor
/*
1. Default constructor
2. Parameterized Constructor
3. Copy Cconstructor 
*/

//1. Default constructor
/*class Car{
    String brand;
    int year;

    //Default constructor
    Car(){
        brand="Mercedes";
        year=2035;
    }

    void dispaly(){
        System.out.println("barnd= "+brand+", year= "+year);
    }
}

public class ClassAndObject{
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.dispaly();
    }
}
*/

//2. Parametterized Constructor

/*class Car{
    String brand;
    int year;

    // Parametterized Constructor
    Car(String b, int y){
        brand=b;
        year=y;
    }

    void display(){
        System.out.println("Brand: "+brand+"\nYear: "+year);
    }
}

public class ClassAndObject{
    public static void main(String[] args) {
        
        //Object initialization via constructor
        Car car1= new Car("Mercedes", 2035);
        Car car2= new Car("Audi", 2036);
        car1.display();
        car2.display();
    }
}
*/

//3. Copy Constructor

class Car{
    String brand;
    int year;

    Car(String b, int y) {
        brand = b;
        year = y;
    }

    Car(Car c){
        this.brand=c.brand;
        this.year=c.year;
    }

    void display(){
        System.out.println("brand= "+ brand+", year= "+year);
    }
}

public class ClassAndObject{
    public static void main(String[] args) {
        Car c1 = new Car("Tesla", 2035);
        Car c2 = new Car(c1);
        c1.display();
        c2.display();
    }
}

