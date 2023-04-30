/* 1. The process of finding the largest value (i.e., the maximum of a
group of values) is used frequently in computer applications. For
example, a program that determines the winner of a sales contest
would input the number of units sold by each salesperson. The
salesperson who sells the most units wins the contest. Build a java
application that inputs a series of 10 integers and determines and
prints the largest integer. Your program should use at least the
following three variables:
      a. counter: A counter to count to 10 (i.e. to keep track of how
      many numbers have been input and to determine when all 10
      numbers have been processed.
      b. number: The inter most recently input by the user.
      c. largest: The largest number found so far.
Note: Every time the sales figure of one employee is entered, the
application should ask the user if they want to enter any more sales
figures of a salesperson!
<br><b>--> SaleContest.java</b>
<br><br><br> */
//
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SaleContest {

    static int counter = 0, number, largest;
    static int findLargest(Object[] ar){
        if ((int) ar.length == 1)
            return (int) ar[0];
        else {
            largest = (int) ar[0];
            for (int i = 0; i < ar.length; i++) {
                if ((int) ar[i] > largest)
                    largest = (int) ar[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        System.out.println("Name - Arju Mondal, Roll no- 39");
        ArrayList<Integer> al = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        while (counter < 10) {
            System.out.print("Enter The Sale of " + (++counter)+ "th Sales Person:\t");
            number = scan.nextInt();
            al.add(number);
            largest = findLargest(al.toArray());
            System.out.println("Largest Sale is:\t" + largest);
            System.out.print("Do You enter any other sale (Press 1):\t");
            if (scan.nextInt() != 1)
                break;
        }
        System.out.println("Exiting System ...");
    }

}
