/* 2. Write an application that prompts the user to enter the size of the
side of a square, then displays a hollow square of that size made of
asterisks. Your program should work for squares of all side lengths
between 1 and 20.
<br><b>--> SquarePattern.java</b>
<br><br><br> */
// Name - Arju Mondal, Roll no- 39

public class SquarePattern {
    static void printStar(int n){
        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }
        System.out.println();
    }

    static void printStarWithSpace(int n){
        System.out.print("*");
        for (int i = 0; i < (2 * n - 3); i++) {
            System.out.print(" ");
        }
        System.out.println("*");
    }

    public static void main(String[] args) {
        System.out.println("Name - Arju Mondal, Roll no- 39");

        int n = 10;
        printStar(n);
        for (int i = 0; i < n - 2; i++) {
            printStarWithSpace(n);
        }
        printStar(n);
    }
}
