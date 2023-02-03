// Name - Arju Mondal, Roll no- 39
// 5.	Write a program in Java to find the maximum of three numbers.
import java.util.Scanner;
 public class _5th{
    public static void main(String args[])
    {
        System.out.println("Name - Arju Mondal, Roll no- 39");
        int num1 = 15;
        int num2 = -5;
        int num3 = 7;
        if (num1 >= num2 && num1 >= num3)
            System.out.println( num1 + " is the maximum number.");
        else if (num2 >= num1 && num2 >= num3)
            System.out.println( num2 + " is the maximum number.");
        else
            System.out.println( num3 + " is the maximum number.");

        LargestNumberExample1 my= new LargestNumberExample1();
    }
}
 class LargestNumberExample1
{
    LargestNumberExample1()
    {
        int a, b, c, largest, temp;
//object of the Scanner class
        Scanner sc = new Scanner(System.in);
//reading input from the user
        System.out.println("Enter the first number:");
        a = sc.nextInt();
        System.out.println("Enter the second number:");
        b = sc.nextInt();
        System.out.println("Enter the third number:");
        c = sc.nextInt();
//comparing a and b and storing the largest number in a temp variable
        temp=a>b?a:b;
//comparing the temp variable with c and storing the result in the variable
        largest=c>temp?c:temp;
//prints the largest number
        System.out.println("The largest number is: "+largest);
    }
}