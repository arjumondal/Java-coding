/* Create an abstract class Accounts with the following details:
          Data Members:
          (a) Balance
          (b) accountNumber
          (c) accountHoldersName
          (d) address
          Methods:
          (a) withdrawl()- abstract
          (b) deposit()- abstract
          (c) display() to show the balance of the account number
          Create a subclass of this class SavingsAccount and add the following details:
          Data Members:
          (a) rateOfInterest
          Methods:
          (a) calculateAount() */
abstract class Accounts{
    float balance;
    long accountNumber;
    String accountHoldersName;
    String address;

    abstract void set(String accountHoldersName, String address, long accountNumber);
    abstract void withdraw(float amount);
    abstract void deposit(float amount);
    abstract void display();
}

class SavingsBank extends Accounts{
    float rateOfInterest;

    public void setRateOfInterest(float rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }

    @Override
    void set(String accountHoldersName, String address, long accountNumber) {
        super.accountHoldersName = accountHoldersName;
        super.address = address;
        super.accountNumber = accountNumber;
    }

    @Override
    void withdraw(float amount) {
        super.balance -= amount;
    }

    @Override
    void deposit(float amount) {
        super.balance += amount;
    }

    @Override
    void display() {
        System.out.println("Account Holder's Name:\t" + accountHoldersName);
        System.out.println("Address:\t" + address);
        System.out.println("Account Number:\t" + accountNumber);
        System.out.println("Remaining Balance:\t" + balance + " Rs.");
    }

    float calculateAmount(int months){
        return (
                super.balance + (
                        (super.balance * (months / 12) * rateOfInterest) / 100
                )
        );
    }
}

public class Question4 {
    public static void main(String[] args) {
        SavingsBank sb = new SavingsBank();
        sb.set("Arju Mondal", "Mohisghot,kolkata", 1234567890);
        sb.setRateOfInterest(7);
        sb.deposit(100);
        sb.withdraw(50);
        sb.display();
        System.out.println("Calculated Amount:\t" + sb.calculateAmount(12) + " Rs.");
    }
}

