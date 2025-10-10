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

public class Constructor{ 
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
}*/

//types of constructor
/*
1. Default constructor
2. Parameterized Constructor
3. Copy Cconstructor 
*/

//1. Default constructor
/*class Student {
    String name;
    int id;
}

public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student(); // Java provides a default constructor
        System.out.println(s1.name); // null
        System.out.println(s1.id);   // 0
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

public class Constructor{
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
 
/*class Car{
    String brand;
    int year;

    // Parameterized constructor
    Car(String b, int y) {
        brand = b;
        year = y;
    }

    //copy constructor
    Car(Car c){
        this.brand=c.brand;
        this.year=c.year;
    }

    void display(){
        System.out.println("brand= "+ brand+", year= "+year);
    }
}

public class Constrructor{
    public static void main(String[] args) {
        Car c1 = new Car("Tesla", 2035);
        Car c2 = new Car(c1);
        c1.display();
        c2.display();
    }
}

*/

//Non-argumented constructor
class Car{
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

public class Constructor{
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.dispaly();
    }
}