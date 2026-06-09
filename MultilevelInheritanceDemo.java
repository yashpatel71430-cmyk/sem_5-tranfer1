class Account 
{
    String accountHolder;
    int accountNumber;

    void setAccountDetails(String name, int accNo) {
        accountHolder = name;
        accountNumber = accNo;
    }

    void displayAccountDetails() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
    }
}

// Derived class from Account
class SavingsAccount extends Account {
    double balance;

    void setBalance(double bal) {
        balance = bal;
    }

    void displayBalance() {
        System.out.println("Balance: " + balance);
    }
}

// Derived class from SavingsAccount
class InterestAccount extends SavingsAccount {
    double interestRate = 5.0; // 5% interest

    void calculateInterest() {
        double interest = (balance * interestRate) / 100;
        System.out.println("Interest: " + interest);
        System.out.println("Total Balance after Interest: " + (balance + interest));
    }
}

// Main class
public class MultilevelInheritanceDemo {
    public static void main(String[] args) {
        InterestAccount ia = new InterestAccount();

        ia.setAccountDetails("Yash patel", 123458910);
        ia.setBalance(100000);

        ia.displayAccountDetails();
        ia.displayBalance();
        ia.calculateInterest();
    }
}