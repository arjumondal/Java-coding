//Name :- Arju Mondal, RollNo :- 39
/* 9. Create 4 threads with priority 1,3,5,7 respectively. Update a counter
in each of the threads for 10 ms. Print the final value of the count for
each thread. */
public class ThreadPriorityDemo {
    private static int counter = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter++;
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t1.setPriority(1);

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter++;
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t2.setPriority(3);

        Thread t3 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter++;
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t3.setPriority(5);

        Thread t4 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter++;
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t4.setPriority(7);

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        t1.join();
        t2.join();
        t3.join();
        t4.join();

        System.out.println("Final value of counter for thread 1: " + t1.getName() + " - " + counter);
        System.out.println("Final value of counter for thread 2: " + t2.getName() + " - " + counter);
        System.out.println("Final value of counter for thread 3: " + t3.getName() + " - " + counter);
        System.out.println("Final value of counter for thread 4: " + t4.getName() + " - " + counter);
    }
}
