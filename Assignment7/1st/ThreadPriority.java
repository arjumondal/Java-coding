//Name :- Arju Mondal, RollNo :- 39
/* 1. Write a Java program in which a total of 4 threads should run. Set
different priorities for the thread. */
public class ThreadPriority {
    public static void main(String[] args) {
        Thread thread = new Thread(new Task(), "MyThread");
        int priority = thread.getPriority();
        System.out.println("The priority of " + thread.getName() + " is " + priority);
    }

    static class Task implements Runnable {
        public void run() {
            // Task implementation
        }
    }
}
