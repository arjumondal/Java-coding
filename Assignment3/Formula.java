/* 3. Write a program to compute the following formula.
  e= 1/0!+ 1/1! +½! + ⅓!+................+ 1/n!
<br><b>--> Formula.java</b>
<br><br><br> */
// Name - Arju Mondal, Roll no- 39

public class Formula {
    static double factorial(int n){
        double fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    static double compute(int n){
        double result = 0;
        for (int i = 0; i <= n; i++) {
            result += 1/factorial(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 1;
        System.out.println("Name - Arju Mondal, Roll no- 39");
        System.out.println("The Value of Formula is:\t"+ compute(n));
    }
}
