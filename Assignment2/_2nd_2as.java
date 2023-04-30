//2.	Write a class, Commission, which has an instance variable, sales; an appropriate constructor; and a method, commission() that returns the commission. Now write a demo class to test the Commission class by reading a sale from the user, using it to create a Commission object after validating that the value is not negative. Finally, call the commission() method to get and print the commission. If the sales are negative, your demo should print the message “Invalid Input”.
//Name - Arju Mondal, Roll no- 39
//commission
import java.util.Scanner;
class Commission{
    private double sales;
    public Commission(double sales){
        this.sales =sales;
    }
    public double getSales(){
        return sales;
    }
    public void setSales(double sales){
        this.sales = sales;
    }
    public double commission(){
        return (sales * 0.1);
    }
}
public class _2nd_2as {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Name - Arju Mondal, Roll no- 39");
        System.out.println("Enter a sales value: ");
        double sales = sc.nextDouble();
        if(sales<0){
            System.out.println("invalid input");
        }else {
            Commission commission = new Commission(sales);
            double com = commission.commission();
            System.out.println("the commission is: "+ com);
        }
    }
}



// import java.util.Scanner;

// class Calculate{
//     float sales;

//     public Calculate(float sales) {
//         if (sales < 0) {
//             System.out.println("Invalid Input");
//             System.exit(0);
//         }
//         this.sales = sales;
//     }

//     public float commission() {
//         return (sales * 10) / 100;
//     }
// }

// public class temp{
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         System.out.print("Enter The Sale:\t");
//         System.out.println("The Commission is:\t" + new Calculate(scan.nextFloat()).commission());
//     }
// }