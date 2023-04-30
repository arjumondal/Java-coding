//1.Write a class, Grader, which has an instance variable, score, an appropriate constructor and appropriate methods. A method, letterGrade(), that returns the letter grade as O/E/A/B/C/F. Now write a demo class to test the Grader class by reading a score from the user, using it to create a Grader object after validating that the value is not negative and is not greater than 100. Finally, call the letterGrade() method to get and print the grade.
// Name - Arju Mondal, Roll no- 39
//grade
import java.util.Scanner;

class Grade{
    float score;

    public Grade(float score) {
        if (!(score < 0 || score > 100))
            this.score = score;
        else {
            System.out.println("Score is not Valid. ");
            System.exit(0);
        }
    }

    char letterGrade() {
        if (score <= 20)
            return 'F';
        else if (score > 20 && score <= 40)
            return 'C';
        else if (score > 40 && score <= 60)
            return 'B';
        else if (score > 60 && score <= 80)
            return 'A';
        else if (score > 80 && score <= 90)
            return 'E';
        else
            return 'O';

    }
}

public class _1st_2as {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Name - Arju Mondal, Roll no- 39");
        System.out.print("Enter The Score:\t");
        System.out.println("The Grade is:\t" + new Grade(scan.nextFloat()).letterGrade());
    }
}