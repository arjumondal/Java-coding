//Name :- Arju Mondal, RollNo :- 39
/* 6. Write a Java Program to Stop a Thread. */
public class StopThread {
    public static void main(String[] args) {
        // Create a new thread and start it
        MyThread myThread = new MyThread();
        myThread.start();

        // Wait for the thread to run for a bit
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Stop the thread
        myThread.stopThread();
    }
}

class MyThread extends Thread {
    private boolean stopRequested;

    public void run() {
        while (!stopRequested) {
            // Do some work here
            System.out.println("Thread is running...");

            // Sleep for a bit to simulate work being done
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void stopThread() {
        stopRequested = true;
    }
}
