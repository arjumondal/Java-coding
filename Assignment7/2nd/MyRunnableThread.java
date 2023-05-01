//Name :- Arju Mondal, RollNo :- 39
/* 2. Write a Java Program to Create a Thread that Implements the
Runnable Interface. */
public class MyRunnableThread implements Runnable {
    @Override
    public void run() {
        System.out.println("MyRunnableThread is running");
    }

    public static void main(String[] args) {
        MyRunnableThread myRunnableThread = new MyRunnableThread();
        Thread thread = new Thread(myRunnableThread);
        thread.start();
    }
}
