// Name - Arju Mondal, Roll no- 39
// 8.	Write a java program to reverse a number entered as a command line argument.
public class _8th {
    public static void main(String[] args) {
        System.out.println("Name - Arju Mondal, Roll no- 39");
        for(String str: args) {
            // convert into integer type
            int argument = Integer.parseInt(str);
            System.out.println("Argument in integer form: " + argument);
            int  reversed = 0;

            System.out.println("Original Number: " + argument);

            // run loop until num becomes 0
            while(argument != 0) {

                // get last digit from num
                int digit = argument % 10;
                reversed = reversed * 10 + digit;

                // remove the last digit from num
                argument /= 10;
            }

            System.out.println("Reversed Number: " + reversed);
        }
    }
}