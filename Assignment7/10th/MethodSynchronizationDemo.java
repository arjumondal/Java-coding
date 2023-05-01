//Name :- Arju Mondal, RollNo :- 39
/* 10.Write a Java Program to Use Method Level Synchronization. */
public class MethodSynchronizationDemo {
    private int counter = 0;

    public synchronized void synchronizedMethod() {
        // This method is synchronized
        for (int i = 0; i < 100000; i++) {
            counter++;
        }
    }

    public void nonSynchronizedMethod() {
        // This method is not synchronized
        for (int i = 0; i < 100000; i++) {
            counter++;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MethodSynchronizationDemo demo = new MethodSynchronizationDemo();

        Thread t1 = new Thread(() -> demo.synchronizedMethod());
        Thread t2 = new Thread(() -> demo.nonSynchronizedMethod());

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final value of counter: " + demo.counter);
    }
}
