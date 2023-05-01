//Name :- Arju Mondal, RollNo :- 39
/* 4. Write a Java Program Defining Thread By Extending the Thread
class. */
public class MyThread extends Thread {
    
    public void run() {
        // Code to be executed in this thread
        System.out.println("Thread is running.");
    }
    
    public static void main(String[] args) {
        // Create a new instance of the MyThread class
        MyThread myThread = new MyThread();
        
        // Start the thread
        myThread.start();
    }
}
