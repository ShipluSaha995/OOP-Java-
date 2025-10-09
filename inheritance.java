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

/*class Animal{
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
}*/

/* 
 There are 5 types of inheritance
 1. single inheritance -> parent->child
 2. Multilevel inheritance -> grand parent->parent->child
 3. Hierarchical Inheritance -> parent->child 1, parent->child 2
 4. Multiple Inheritance -> parent 1 & parent 2 -> child -> java doesn't support multiple inheritance
 5. Hybrid Inheritance -> mix of 2 or more types of inheritance 
 */


//1. Single inheritance
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

// 2.Multilevel inheritance

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

class Puppy extends Dog{
    void weep(){
        System.out.println("weep");
    }
}

public class inheritance {

    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.eat();
        p.bark();
        p.weep();
    }
}*/

// 3. Hierarchical Inheritance

class Animal{
    void eat(){
        System.out.println("eating");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("Bark");
    }
}

class Cat extends Animal{
    void mewo(){
        System.out.println("mewo");
    }
}

public class inheritance {

    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();

        d.bark();
        d.eat();
        c.mewo();
        c.eat();
    }
}




