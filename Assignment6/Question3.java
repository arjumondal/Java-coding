/* 3. Write a program that takes a value at the command line for which factorial is to be computed. The program must convert the string to its integer equivalent. There are three possible user input errors that can prevent the program from executing normally.<br>
    ● The first error is when the user provides no argument while executing the program and an ArrayIndexOutOfBoundsException is raised. You must write a catch block for this.<br>
    ● The second error is NumberFormatException that is raised in case the user provides a non-integer (float double) value at the command line.<br>
    ● The third error is IllegalArgumentException. This needs to be thrown manually if the value at the command line is 0. */
public class Question3 {
    static int factorial(int x){
        int fact = 1;
        for (int i = 1; i <= x; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        try{
            if (args[0].equals("0"))
                throw new IllegalArgumentException("0 is not Allowed.");
            System.out.println(factorial(Integer.parseInt(args[0])));
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Out of Bound.");
        }
        catch (NumberFormatException e){
            System.out.println("Value is Not an Integer.");
        }
        catch (IllegalArgumentException e){
            System.out.println(e);
        }
    }
}
