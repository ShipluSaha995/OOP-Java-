
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


//Thread life-cycle: by using the thread class (5 stages )
/*                               JVM will allocate the proccess              when task is completed                      
born/create thread---> Runnable-----------------------------------> Runing--------------------------> Dead
                            ^                                          |
                            |                                          |
                            |                                          |
                        (sleep(),                 waiting,           suspend)

*/

//we can create threade by extending the thread class or implementing the runable interface

//Extending thread class

/*class th extends Thread{
    public void run(){
        System.out.println("Thread running.");
    }
}

public class ThreadMain{
    public static void main(String[] args){
        th t1 = new th();
        t1.start();
    }
}*/


//implementing runnable interface

/*class Th implements Runnable{
    public void run(){
        System.out.println("Threade runnig.");
    }
}

public class ThreadMain{
    public static void main(String[] args) {
        Thread t1 = new Thread(new Th());
        t1.start();
    }
}*/

//performing single task from multiple threads

/*class Task implements Runnable{
    public void run(){
        System.out.println(Thread.currentThread().getName()+" is running");
    }
}

public class ThreadMain{
    public static void main(String[] args) {
        Thread t1 = new Thread(new Task());
        Thread t2 = new Thread(new Task());
        Thread t3 = new Thread(new Task());

        t1.start();
        t2.start();
        t3.start();
    }
}*/

//performing multiple task from multiple thread

/*class Task1 implements Runnable {
    public void run(){
        System.out.println("Task1 is running.");
    }
}

class Task2 implements Runnable{
    public void run(){
        System.out.println("Task2 is running");
    }
}

public class ThreadMain{
    public static void main(String[] args) {
        Thread t1 = new Thread(new Task1());
        Thread t2 = new Thread(new Task2());

        t1.start();
        t2.start();
    }
}

//which thread will execute first and which one will execute last its depends on JVM and Thread Scheduler.

*/

//priorities:
/* 

def: Thread priority is a parameter in java that specifies the relative importance of a thread and determines the order in 
which threads are scheduled executuion by the CPU.

--> Jvm provides the prioprities to each thread and according to this these priorities jvm allocates the proccessor.
--> priorities are represented in the form of integer values in range of 1-10.
--> 1-> MIN_Priority
--> 5-> NORM_Priority
--> 10-> MAX_Priority

*/

/*class Th implements Runnable{
    public void run(){
        //Thread.currentThread().setName("Shiplu1");
        System.out.println(Thread.currentThread().getName()+" Priotity:"+Thread.currentThread().getPriority());
    }
}

public class ThreadMain{
    public static void main(String[] args) {
        Thread t1 = new Thread(new Th()); 
        Thread t2 = new Thread(new Th()); 
        Thread t3 = new Thread(new Th());
        Thread t4 = new Thread(new Th());
        Thread t5 = new Thread(new Th());
        
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(6);
        t5.setPriority(7);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}*/

/*sleep()

Thread.sleep() is a static method of the thread class that causes the currently executing thread to
pause execution for a specific period of time.

--> public static native void sleep(long mili) throws InterruptedException.
--> public static void sleep (long mili, int name) throws InterruptedException. 

*/

/*class Th implements Runnable{
    private int num;
    private boolean isEven;

    Th(int start, boolean isEven){
        this.num=start;
        this.isEven=isEven;
    }

    public void run(){
        try{
            while(true){
                if(isEven && num%2==0){
                    System.out.println("Even: "+ num);
                    num+=2;
                    Thread.sleep(1000);
                }else if(!isEven && num%2!=0){
                    System.out.println("Odd: "+num);
                    num+=2;
                    Thread.sleep(1000);
                }
            }
        }catch(InterruptedException e){
            System.out.println(e);
        }
    }
}

public class ThreadMain{
    public static void main(String[] args) {
        Thread t1 = new Thread(new Th(2, true));
        Thread t2 = new Thread(new Th(1, false));
        t1.start();
        t2.start();
    }
}*/

/*
yield(): 

Thread.yield() is a static method in java that causes currently executing thread to temporarily 
pause and give others threads of the same priority a chance to execute

--> its a hint to the thread scheduler execution order is not granted
--> The current thread moves freom running to runnable state
--> Does not release locks
--> Useful for improving CPU utilization and fairness.
--> It is a static method: always affects the current thread.


*/

/*class Th implements Runnable {
    public void run(){
        for(int i=1; i<=5; i++){
            System.out.println(Thread.currentThread().getName()+": "+i);
            Thread.yield();
        }
    }
}

public class ThreadMain{
    public static void main(String[] args) {
        Thread t1 = new Thread(new Th());
        Thread t2 = new Thread(new Th());

        t1.setName("Thread 1: ");
        t2.setName("Thread 2: ");

        t1.start();
        t2.start();
    }
}*/

/*
join():

the join method in java causes the currrent thread to wait until the thread which is called 
has finished execution.

--> ensures sequential execution among threads 
--> can wait indefinitely or for a specified time
--> helps in synchronizing  threads in multithreaded programms
--> throws InterruptedException

*/



/*class JoinDemo extends Thread {

    public JoinDemo(String name) {
        super(name);
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " : " + i);
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class ThreadMain {
    public static void main(String[] args) {

        JoinDemo t1 = new JoinDemo("Thread-1");
        JoinDemo t2 = new JoinDemo("Thread-2");
        JoinDemo t3 = new JoinDemo("Thread-3");

        t1.start();

        try {
            t1.join(); 
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        t2.start();
        t3.start();
    }
}
*/

/*
Synchronization:

It is a machanism in java that ensures that only one thread at a time can access a shared resource
thereby preventing data inconsistency 


*/


//extra
/*import java.util.Random;
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
*/

