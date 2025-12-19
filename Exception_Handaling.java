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

class Tr{
    
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
}

