//3.	For a  Mobile  Shop project,  create  “Telephone”  class with details like mobile_id,  model_name  and  available_quantity  in  “Phone”  package.  Inherit from this class and create a class for “smart_phone” with necessary details like enabled_5G, foldable and dual_screen in package “Smart”. The customer executive tries to display all smart_phone details (mobile_id, model_name, available_quantity, enabled_5G, foldable and dual_screen) and updates the quantity information, whenever the customer purchases the smart_phone.  Write the necessary java programs to implement this scenario and test with user inputs.
//Name - Arju Mondal, Roll no- 39
// Main Class
import smart.Smartphone;
import java.util.Scanner;

public class mobile {
    public static void main(String[] args) {
        
     {
        Scanner sc = new Scanner(System.in);
        System.out.println("Name - Arju Mondal, Roll no- 39");
        System.out.print("Enter Mobile ID: ");
        int mobile_id = sc.nextInt();
        System.out.print("Enter Model Name: ");
        String model_name = sc.next();
        System.out.print("Enter Available Quantity: ");
        int available_quantity = sc.nextInt();
        System.out.print("Is 5G Enabled (true/false): ");
        boolean enabled_5G = sc.nextBoolean();
        System.out.print("Is Foldable (true/false): ");
        boolean foldable = sc.nextBoolean();
        System.out.print("Is Dual Screen (true/false): ");
        boolean dual_screen = sc.nextBoolean();

         Smartphone sp = new Smartphone(mobile_id, model_name, available_quantity, enabled_5G, foldable, dual_screen);
         sp.displayDetails();

        System.out.print("Enter the Quantity to Purchase: ");
        int purchase = sc.nextInt();
         sp.updateQuantity(purchase);
    }
}}
