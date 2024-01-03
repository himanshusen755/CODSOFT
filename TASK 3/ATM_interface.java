import java.util.Scanner;

class BankAccount {
    private double balance;
    private int pin;

    public BankAccount(double initialBalance, int pin) {
        this.balance = initialBalance;
        this.pin = pin;
    }

    public double getBalance() {
        return balance;
    }

    public boolean authenticate(int enteredPin) {
        return enteredPin == pin;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }
}

class ATM {
    private BankAccount userAccount;

    public ATM(BankAccount userAccount) {
        this.userAccount = userAccount;
    }

    public void displayMenu() {
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
    }

    public void processOption(int choice, Scanner scan) {
        switch (choice) {
            case 1:

                System.out.print("Enter the amount to withdraw: ");
                double WA = scan.nextDouble(); //Withdraw amount
                if (userAccount.withdraw(WA)) {
                System.out.println("------------------------------------------------------------------------------------");
                System.out.println("Withdrawal successful. Remaining balance: " + userAccount.getBalance());
                System.out.println("------------------------------------------------------------------------------------");

                } else {
                    System.out.println("================================================================================");                System.out.println("------------------------------------------------------------------------------------");
                    System.out.println("Withdrawal failed. Insufficient funds or invalid amount.");
                    System.out.println("================================================================================");                System.out.println("------------------------------------------------------------------------------------");

                }
                break;

            case 2:
                System.out.print("Enter the amount to deposit: ");
                double DA = scan.nextDouble(); //Deposite amount
                userAccount.deposit(DA);
                System.out.println("================================================================================");                System.out.println("------------------------------------------------------------------------------------");
                System.out.println("Deposit successful. Updated balance: " + userAccount.getBalance());
                System.out.println("================================================================================");                System.out.println("------------------------------------------------------------------------------------");

                break;

            case 3:
              System.out.println("================================================================================");                System.out.println("------------------------------------------------------------------------------------");
              System.out.println("Current balance: " + userAccount.getBalance());
              System.out.println("================================================================================");                System.out.println("------------------------------------------------------------------------------------");

                break;

            case 4:
                System.out.println("================================================================================");                System.out.println("------------------------------------------------------------------------------------");
                System.out.println("Exiting ATM. Thank you!");
                System.out.println("================================================================================");                System.out.println("------------------------------------------------------------------------------------");
                System.exit(0);
                break;

            default:
                System.out.println("================================================================================");                System.out.println("------------------------------------------------------------------------------------");
                System.out.println("Invalid option. Please choose a valid option.");
                System.out.println("================================================================================");                System.out.println("------------------------------------------------------------------------------------");

        }
    }
}

public class ATM_interface {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        
        double IB = 1000.0; // IB -> initalBalance
        int pin = 6260;

        BankAccount userAccount = new BankAccount(IB, pin);
        ATM atm = new ATM(userAccount);

        
        System.out.print("Enter your PIN: ");
        int enteredPin = scan.nextInt();
        if (!userAccount.authenticate(enteredPin)) {
            System.out.println("Invalid PIN. Exiting.");
            System.exit(0);
        }

        while (true) {
            atm.displayMenu();
            System.out.print("Enter your choice: ");
            int choice = scan.nextInt();
            atm.processOption(choice, scan);
        }
    }
}
