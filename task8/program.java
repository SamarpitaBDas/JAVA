public class BankAccount {
    private int accountNumber;
    private String accountHolderName;
    private double balance;
    private int pin;

    // Constructor, getters, setters, and methods for deposit, withdraw, and PIN validation
}

public class ATMMachine {
    private BankAccount bankAccount;

    public ATMMachine(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public void displayMenu() {
        // Display ATM menu options
    }

    public void checkBalance() {
        // Implement logic to check account balance
    }

    public void withdrawMoney(double amount) {
        // Implement logic to withdraw money from the account
    }

    public void depositMoney(double amount) {
        // Implement logic to deposit money into the account
    }

    public boolean validatePin(int pin) {
        // Implement logic to validate the user's PIN
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a BankAccount instance
        BankAccount bankAccount = new BankAccount(/* pass required parameters */);

        // Create an ATMMachine instance
        ATMMachine atmMachine = new ATMMachine(bankAccount);

        // Implement the main program logic
    }
}
