// Name - Arju Mondal, Roll no- 39
// 10.	Write a java program to find all the multiples of 3 within a given range where the starting and ending value are entered through command line argument.
public class _10th{
    public static void main(String[] args) {
        System.out.println("Name - Arju Mondal, Roll no- 39");
        int num = 0, num2 = 0;
        num = Integer.parseInt(args[0]);
        System.out.println("Initial number is: "+num);
        num2 = Integer.parseInt(args[1]);
        System.out.println("End number is: "+num2);
        for( num = num ; num <= num2; num++)
            if(num % 3 == 0)
                System.out.println(num);
    }
}
//import java.util.Scanner;
//public class temp{
//    public static void main(String[] args){
//        int i,n;
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the initial number:");
//        i = sc.nextInt();
//        System.out.print("Enter the end number:");
//        n = sc.nextInt();
//        for( i= i;i <= n; i++)
//            if(i % 3 == 0)
//                System.out.println(i);
//    }
//}