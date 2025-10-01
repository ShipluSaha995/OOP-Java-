//just t practice arrays

//sum and average
import java.util.Scanner;
public class arrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int sum=0;
        int[] num=new int[n];
        for(int i=0; i<n; i++){
            num[i]=sc.nextInt();
            sum=sum+num[i]; 
        }

        float avg=(float)sum/n;

        for(int i=0; i<n; i++){
            System.out.print(num[i]+" ");
        }

        System.out.println("\nsum= "+sum);
        System.out.println("average= "+avg);
        sc.close();
    }
}
