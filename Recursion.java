class sum{
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
}