// Name - Arju Mondal, Roll no- 39
// 9.	Write a java Program to count the number of digits entered through the command line argument.
public class _9th {
    public static void main(String[] args) {
        System.out.println("Name - Arju Mondal, Roll no- 39");
        for(String str: args) {
            // convert into integer type
            int argument = Integer.parseInt(str);
            System.out.println("Argument in integer form: " + argument);

            int count = 0;

            while (argument != 0) {
                // num = num/10
                argument /= 10;
                ++count;
            }

            System.out.println("Number of digits: " + count);
        }
    }
}