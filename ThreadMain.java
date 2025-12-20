
/*Difference between multi-tasking, multi-Threading and multi processing 

1.Multi-tasking: 
Performing multiple task at a single time. like

VLC WOrd Browser
 |    |     |-------->
 |    |-------------->  OS------> CPU
 |------------------->

 Multi Tasking Increase the performance of the cpu.
 Multi tasking can be achieved in 2 ways:
 1. Multi Threading
 2. Multi Proccessing.

2.Multi-Proccessing:
When one System is connected to multiple proccessors in order to complete the task.
like

VLC WOrd Browser
 |    |     |-------->
 |    |-------------->  OS------> CPU_1
 |------------------->   |------> CPU_2
                         |------> CPU_3

Its best suitable at system level or OS level


3.Multi Threading:
Executing multiple threads(Sub proccess, small task) at single time.

VLC
 |------->video------|
 |-------> Audio-----|------>OS------> CPU
 |-------> Timer-----|

*/

//we can create threade by extending the thread class or implementing the runable interface


import java.util.Random;
import java.util.Scanner;

class Search extends Thread {
    private int[] arr;
    private int start;
    private int end;
    private int target;

    public Search(int[] arr, int start, int end, int target, String threadName) {
        this.arr = arr;
        this.start = start;
        this.end = end;
        this.target = target;
        this.setName(threadName);
    }

    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            if (arr[i] == target) {
                System.out.println("Number " + target +
                        " found at index " + i +
                        " by " + Thread.currentThread().getName());
            }
        }
    }
}

public class ThreadMain {
    public static void main(String[] args) {

        int[] arr = new int[200];
        Random ran = new Random();

        // Generate random numbers
        for (int i = 0; i < 200; i++) {
            arr[i] = ran.nextInt(1000);
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to search: ");
        int N = sc.nextInt();

        // Create threads
        Search t1 = new Search(arr, 0, 40, N, "Thread-1");
        Search t2 = new Search(arr, 41, 80, N, "Thread-2");
        Search t3 = new Search(arr, 81, 120, N, "Thread-3");
        Search t4 = new Search(arr, 121, 160, N, "Thread-4");
        Search t5 = new Search(arr, 161, 199, N, "Thread-5");

        // Start threads
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        sc.close();
    }
}
