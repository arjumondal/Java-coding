//Name :- Arju Mondal, RollNo :- 39
/* 5. Write a Java Program to Get the Name of a Running Thread. */
public class ThreadName {
    public static void main(String[] args) {
        // Get a reference to the currently running thread
        Thread currentThread = Thread.currentThread();

        // Get the name of the currently running thread
        String threadName = currentThread.getName();

        // Print the name of the currently running thread
        System.out.println("Currently running thread name: " + threadName);
    }
}
