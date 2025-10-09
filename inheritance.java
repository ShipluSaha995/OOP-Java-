/*Definstion of inheritence: Inheritance is the proccess by which one class acquires the properties and 
behaiviors of another class

it allows the creation of built upon existing ones, enabling code reusability, extensibility and 
represantation of real-world hierarchical relationships.

The class that inherits is called the subclass and the class from which it inherits is called
the supper class

*/

/*class Animal{
    void eat(){
        System.out.println("Eating");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("Bark");
    }
}

public class inheritance {

    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.bark();
    }
}*/

//Overriding or Run time polymorphism

/*class Animal{
    void eat(){
        System.out.println("Eating");
    }
}

class Dog extends Animal{
    void eat(){
        System.out.println("Eat");
    }

    void bark(){
        System.out.println("bark");
    }
}

public class inheritance {

    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat(); // it will call the eat method from the dog class by overriding the eat method of the animal class
        d.bark();
    }
}*/

//If we want to access both method we have to use super keyword

class Animal{
    void eat(){
        System.out.println("Eating");
    }
}

class Dog extends Animal{
    
    void eat(){
        super.eat(); //calls the parent class method
        System.out.println("Eat");
    }

    void bark(){
        System.err.println("bark");
    }
}

public class inheritance {

    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.bark();
    }
}