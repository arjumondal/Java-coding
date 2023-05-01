//Name :- Arju Mondal, RollNo :- 39
/* 3. Write a Java Program to Check the Priority Level of a Thread. */
public class ThreadPriorityDemo {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Task(), "Thread 1");
        Thread t2 = new Thread(new Task(), "Thread 2");
        Thread t3 = new Thread(new Task(), "Thread 3");
        Thread t4 = new Thread(new Task(), "Thread 4");

        t1.setPriority(Thread.MIN_PRIORITY); // Set Thread 1 to lowest priority
        t2.setPriority(Thread.NORM_PRIORITY - 1); // Set Thread 2 to slightly lower priority than normal
        t3.setPriority(Thread.NORM_PRIORITY + 1); // Set Thread 3 to slightly higher priority than normal
        t4.setPriority(Thread.MAX_PRIORITY); // Set Thread 4 to highest priority

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}

class Task implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " running with priority " + Thread.currentThread().getPriority());
    }
}
