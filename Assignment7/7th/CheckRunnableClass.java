//Name :- Arju Mondal, RollNo :- 39
/* 7. Write a Java Program to Check Whether Define a Thread Class
Without Defining run() Method in the Class. */
public class CheckRunnableClass {
    public static void main(String[] args) {
        // Create some objects to test
        Object obj = new Object();
        Runnable runnable = new MyRunnable();

        // Check whether each object is a runnable
        System.out.println("obj is a runnable: " + isRunnable(obj));
        System.out.println("runnable is a runnable: " + isRunnable(runnable));
    }

    public static boolean isRunnable(Object obj) {
        // Check whether the object is a Runnable
        return obj instanceof Runnable;
    }
}

class MyRunnable implements Runnable {
    public void run() {
        System.out.println("MyRunnable is running...");
    }
}
