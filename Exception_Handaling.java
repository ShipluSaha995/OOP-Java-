/*Exceprion Handaling 

Exception handling in Java is a way to deal with unexpected problems that occur during a program’s execution. 
These problems can include invalid input, missing files, or calculation errors. Instead of stopping the entire program, 
Java allows developers to catch these issues and handle them safely. This helps keep the program stable, easier to fix
and more user-friendly. 

Exception: An exception is an event that occurs during the execution of a program that disrupts the normal flow of instructions. 
It represents an abnormal condition such as invalid data, unavailable resources, or logical errors that requires special 
handling to prevent the program from crashing.

Errors: An error is a serious problem that occurs during program execution and cannot usually be handled or recovered by the program itself. 
Errors often happen due to issues outside the program’s control, such as hardware failure, memory shortage, or system crashes. 
Because they are critical, Java programs generally cannot continue running when an error occurs.

Exception follows Hierchical Order

Object class--->Throwable Class--->Error
                            |
                            |---->Exception--->IOE Exception 
                                    |-----> Runtime Exception


*/


/*
Exception Occurs:

1. Invalid User Input
2. Illigel Operation (like a=10 and b=0 result 10/0)
3. File or Resource not found
4. Accessing invaild index
5. Network or database issue
6. Insufficient System Resources

There are 3 types of exception
1. Checked Exception-----> compiler checks at compile time
2. Uncheked Exception----> occure during run time due to programming mistakes
3. Error-----------------> Serious problems that cannot be handeled by programmer 


For exception handaling in java we use 
1. try-catch block
2. finally key-word
3. throw key-word
4. throws key-word

*/

//try-catch block

/*class Tr{
    
    Tr(int a, int b){
        try{
            int result=a/b;
            System.out.println(result);
        }catch(ArithmeticException e){
            System.out.println("Cannot divided by 0.");
        }
    }
}

public class Exception_Handaling{
    public static void main(String[] args) {
        Tr t = new Tr(10, 0);
    }
}*/

//we can also do the try-catch in main fuction

/*public class Exception_Handaling{
    public static void main(String[] args) {
        int a=10;
        int b=0;
        try{
            int result=a/b;
            System.out.println(result);
        }catch(ArithmeticException e){
            System.out.println("Cannot divided by 0.");
        }

        System.out.println("Programe continues normally.");
    }
}*/

//multiple catch block

/*class Mul{
    Mul(){
        int arr[]={10, 20, 30};
        try{
            int result=arr[2]/0;
            
            System.out.println(result);

        }catch(ArithmeticException e){
            System.out.println("Arithmetic Exception Occur");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of range");
        }catch(Exception e){
            System.out.println("General exception occured");
        }

    }
}
public class Exception_Handaling{
    public static void main(String[] args) {
        Mul m = new Mul();
    }
}*/


//Finally block

/*public class Exception_Handaling {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int result = a / b;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by 0.");
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}*/

// we can also use try-catch block inside a finally block if we need 

/*class Fin{

    Fin(){
        try{
            int a=10;
            int b=0;
            int result=a/b;
            System.out.println(result);
        }catch(ArithmeticException e){
            System.out.println("Exception caught in outside catch block.");
        }
        finally{
            System.out.println("Inside finnaly block");
            try{
                int arr[]={10, 20, 30};
                System.out.println(arr[5]);
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Exception caught inside the finally block.");
            }
            
        }
    }
}

public class Exception_Handaling{
    public static void main(String[] args) {
        Fin F = new Fin();
    }
}*/

//Throw keyword

/*Throw key word basically use for custom exceptios but we can also use it for default exception. 
it means programmer is throwing the exception not compiler */

class Th{
    Th(){
        int balance=5000;
        try{
            if(balance<10000){
                throw new ArithmeticException("Insufficient balance.");
            }
            else{
                System.out.println("Transacton succesfull.");
            }
        }catch(ArithmeticException e){
            System.out.println("Exception caught " + e.getMessage());
        }
    }
}

public class Exception_Handaling{
    public static void main(String[] args) {
        Th T = new Th();
    }
}