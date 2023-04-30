/* 5. Implement the below Diagram.
Here, Asset class is an abstract class containing an abstract method displayDetails() method. Stock, bond and Savings class inherit the Asset class and displayDetails() method is defined in every class.
<img width="436" alt="image" src="https://user-images.githubusercontent.com/78160448/226370988-55f3731e-1cf3-42a6-8c3b-9c52ac21fbb9.png">
 */
import java.util.Date;

abstract class Asset{
    String descriptor;
    Date date;
    float current_value;

    public void set(float current_value, String descriptor) {
        this.current_value = current_value;
        this.descriptor = descriptor;
        this.date = new Date();
    }

    abstract void displayDetails();
}

class Stock extends Asset{
    int num_shares = 5;
    float share_price = 1000;
    String asset = "Stock Asset";

    @Override
    void displayDetails() {
        set(10000, "Descriptor From Stock");
        System.out.println("Num Shares:\t" + num_shares);
        System.out.println("Share Prices:\t" + share_price);
        System.out.println("Asset:\t" + asset);
        System.out.println("Descriptor:\t" + descriptor);
        System.out.println("Current Value:\t" + current_value);
        System.out.println("Date:\t" + date.getDate() + "/" + date.getMonth() + "/" + (date.getYear() + 1900));
    }
}

class Bond extends Asset{
    float interest_rate = 10;
    String asset = "Bond Asset";

    @Override
    void displayDetails() {
        set(20000, "Descriptor From Bond");
        System.out.println("Interest Rate:\t" + interest_rate);
        System.out.println("Asset:\t" + asset);
        System.out.println("Descriptor:\t" + descriptor);
        System.out.println("Current Value:\t" + current_value);
        System.out.println("Date:\t" + date.getDate() + "/" + date.getMonth() + "/" + (date.getYear() + 1900));
    }
}

class Savings extends Asset{
    float interest_rate = 20;
    String asset = "Savings Asset";

    @Override
    void displayDetails() {
        set(30000, "Descriptor From Savings");
        System.out.println("Interest Rate:\t" + interest_rate);
        System.out.println("Asset:\t" + asset);
        System.out.println("Descriptor:\t" + descriptor);
        System.out.println("Current Value:\t" + current_value);
        System.out.println("Date:\t" + date.getDate() + "/" + date.getMonth() + "/" + (date.getYear() + 1900));
    }
}


public class Question5 {
    public static void main(String[] args) {
        Stock stk = new Stock();
        Bond bnd = new Bond();
        Savings svg = new Savings();

        stk.displayDetails();
        bnd.displayDetails();
        svg.displayDetails();
    }
}
