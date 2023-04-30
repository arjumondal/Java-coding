/* 4. Create a user-defined exception named CheckArgument to check the number of arguments passed through the command line. If the number of arguments is less than 5, throw the CheckArgumentexception, else print the addition of all the five numbers. */
class CheckArgument extends Exception{
    public CheckArgument(String s){
        super(s);
    }
}

public class Question4 {
    public static void main(String[] args) {
        try {
            if (args.length < 5)
                throw new CheckArgument("Argument Number is Less than 5.");
            else {
                int x = 0;
                for (String c :
                        args) {
                    x += Integer.parseInt(c);
                }
                System.out.println("The Sum is:\t" + x);
            }
        }
        catch (CheckArgument e){
            System.out.println(e);
        }
    }
}
