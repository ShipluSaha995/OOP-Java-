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

/*class Animal{
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
*/

/*Multiple Inheritance: Multiple Inheritance is  a feature of object oreinted programming where a class can inherits properties
and behaviors from more than one parent

However, in java multiple inheritance in with classes is not supported to avoid ambiguity and complexity but it can be 
achieved using interfaces

java does not support it because suppose two parent classes having the same method name compiler will be confused which one to call or 
which one will the child class inherit. this is called the Diamond problem

*/


/*In interfaces, there is no method implementation only method declaration so no ambiguity occurs thats why java 
 allows multiple inheritance via interfaces
  */
  
interface Camera{
    void takePhoto();
}

interface MediaPlayer{
    void PlayMusic();
}

class Mobile implements Camera, MediaPlayer{
    public void takePhoto(){
        System.out.println("Taking Photo");
    }

    public void PlayMusic(){
        System.out.println("Playing Music");
    }
}

public class inheritance{
    public static void main(String[] args) {
        Mobile M = new Mobile();
        M.PlayMusic();
        M.takePhoto();
    }
}




