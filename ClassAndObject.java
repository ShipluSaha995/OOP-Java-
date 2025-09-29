
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
        car1.display();
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

    void dispolay(){
        System.out.println("Car: "+brand+"\nYear: "+year);
    }
}

public class ClassAndObject{
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.SetValues("Mercedes", 2035);
        car1.dispolay();
    }

}
*/


//practice
import java.util.Scanner;
class Student{
    String name;
    int id;
    String dep;

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

        Student stud = new Student(name, id, dep);
        stud.dispaly();
        sc.close();
    }
}



