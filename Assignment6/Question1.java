/* 1. Write a Java program using try and catch to generate Array Index Out of Bound Exception and Arithmetic Exception. */
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter The Length of Array:\t");
        int n = scan.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i <= n; i++) {
            System.out.println("Variable " + (i+1) + " is:\t");
            try {
                arr[i] = scan.nextInt();
                arr[i] = arr[i] / (n-i-1);
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Array Index is Out of Bound.");
            }
            catch (ArithmeticException e){
                System.out.println("This is an Arithmetic Exception.");
            }
        }
    }
}
