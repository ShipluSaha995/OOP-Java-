/*Method Overloading is the feature of the object oriented programming that where multiple methods in the same can have the same 
 but differ in the number of parametters or the type of parametters. The compiler determins which version of the method to invoke
 at compile time, making it an example of compile time polymorphism.

 There are two ways to overload the method in java​
1. By changing number of arguments
2. By changing the arguments

 */


 class sum{

    int sum(int a, int b){
        return (a+b);
    }

    double sum(double a, double b){
        return (a+b);
    }

    int sum(int a, int b, int c){
        return (a+b+c);
    }
}

public class MethodOverloading{
    public static void main(String[] args) {
        sum me = new sum();

        System.out.println(me.sum(10, 20));
        System.out.println(me.sum(10.23, 20.25));
        System.out.println(me.sum(10, 20, 30));
    }
}


