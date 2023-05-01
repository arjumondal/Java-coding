//Name :- Arju Mondal, RollNo :- 39
/* 8. Write a Java Program to Show that Method Will be Verified Whether
it is Synchronized or Not. */
public class SynchronizedMethodDemo {

    public synchronized void synchronizedMethod() {
        // This method is synchronized
        System.out.println("This is a synchronized method.");
    }

    public void nonSynchronizedMethod() {
        // This method is not synchronized
        System.out.println("This is a non-synchronized method.");
    }

    public static void main(String[] args) {
        SynchronizedMethodDemo demo = new SynchronizedMethodDemo();

        // Call the synchronized method
        demo.synchronizedMethod();

        // Call the non-synchronized method
        demo.nonSynchronizedMethod();
    }
}
