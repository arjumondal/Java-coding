/* 2. Write a class that keeps a running total of all characters passed to it (one at a time) and throws an exception if it is passed a non-alphabetic character. */
import java.util.*;


class Counter{
    static int count = 0;
    int[] chars  = {'A', 'Z', 'a', 'z'};

    protected void pass(char x) throws Exception{
        if (((int) x >= chars[0] && (int) x <= chars[1]) || ((int) x >= chars[2] && (int) x <= chars[3])) {
            count++;
            System.out.println("Total Character Number is:\t" + count);
        }
        else {
            String msg = "\nNot a Character.\nTotal Number of Characters is:\t" + count;
            throw new Exception(msg);
        }
    }
}

public class Question2{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Counter c = new Counter();
        System.out.println("How Many Times You Want to Pass Input:\t");
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Character Number " + (i + 1) + " is:\t");
            try {
                c.pass(scan.next().charAt(0));
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
    }
}
