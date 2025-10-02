//just t practice arrays

//sum and average
/* 
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
*/

//find the largest value from an array
/*import java.util.Scanner;
public class arrays{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        int[] num= new int[n];

        for(int i=0; i<n; i++){
            num[i]=sc.nextInt();
        }

        for(int i=0; i<n; i++){
            System.out.println(num[i]+" ");
        }

        int max=num[0];
        for(int i=0; i<n; i++){
            if(num[i]>max){
                max=num[i];
            }
        }

        System.out.println("Maximum: "+max);
        sc.close();
    }
}*/


//Write a Java Program to Check if An Array Contains a Given Value (Linear Search).

/*import java.util.Scanner;

class linear{
    void search(){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();

        int[] num = new int[n];
        for(int i=0; i<n; i++){
            num[i]=sc.nextInt();
        }

        int x=sc.nextInt();
        boolean found=false;
        for(int i=0; i<n; i++){
            if(num[i]==x){
                System.out.println("found at position: "+ (i+1));
                found=true;
                break;
            }
        }

        if(!found){
            System.out.println("not found");
        }
        sc.close();
    }
}

public class arrays{
    public static void main(String[] args) {
        linear ln=new linear();
        ln.search();
    }
}*/


//Write a Java Program to Check if An Array Contains a Given Value (Binary Search).

import java.util.Scanner;

class binary{
    void search(){
        Scanner sc =new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr=new int[n];

        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        int x= sc.nextInt();
        int low=0, high=n-1;
        boolean found=false;


        while(low<=high){
            int mid=(low+high)/2;

            if(arr[mid]==x){
                System.out.println("found at position: "+ (mid+1));
                found=true;
                break;
            }
            else if(arr[mid]<x){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        if(!found){
            System.out.println("not found");
        }

        sc.close();
    }
}

public class arrays{
    public static void main(String[] args) {
        binary bi = new binary();
        bi.search();
    }
}