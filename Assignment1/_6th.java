// Name - Arju Mondal, Roll no- 39
// 06.Write a Java Program to check whether a given year is a leap year.
import java.util.Scanner;
public class _6th{
    public static void main(String args[]) {
        System.out.println("Name - Arju Mondal, Roll no- 39");
        int year;
        System.out.println("Enter the year::");
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();
        if (((year%4==0)&&(year%100!=0))||(year%400==0))
        {
            System.out.println(year+" is a leap year");
        }
        else
        {
            System.out.println(year+" is a not a leap year");
        }
    }
}