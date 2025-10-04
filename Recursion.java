//Use recursion to add all of the numbers up to 10.
/*class sum{
    int sum(int n){
        if(n==1){
            return 1;
        }else{
            return n+sum(n-1);
        }
    }
}

public class Recursion{
    public static void main(String[] args) {
        sum s = new sum();
        int result = s.sum(10);
        System.out.println(result);
    }
}*/


//factorial

/*class factorial{
    int fact(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }
}

public class Recursion{
    public static void main(String[] args) {
        factorial f = new factorial();
        int result=f.fact(5);
        System.out.println(result);
    }

}*/

// Find the sum of digits of a number using recursion.

class digit{
    int dig(int n){
        if(n==0){
            return 0;
        }else{
            return (n%10)+dig(n/10);
        }
    }
}

public class Recursion{
    public static void main(String[] args) {
        digit d = new digit();
        int result=d.dig(12345);
        System.out.println(result);
    }
}