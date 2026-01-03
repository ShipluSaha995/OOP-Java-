
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

class Th implements Runnable {
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
}