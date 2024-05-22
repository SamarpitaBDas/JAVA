package task8;

import java.util.Scanner;

class ATM {
    float Balance;
    int PIN = 5674;

    public void checkpin() {
        System.out.println("Enter your pin: ");
        Scanner sc = new Scanner(System.in);
        int enteredpin = sc.nextInt();
        if (enteredpin == PIN) {
            menu();
        } else {
            System.out.println("Enter a valid pin");
        }
    }

    public void menu() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter Your Choice: ");
            System.out.println("1. Check A/C Balance");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Deposit Money");
            System.out.println("4. EXIT");

            int option = sc.nextInt();

            if (option == 1) {
                checkBalance();
            } else if (option == 2) {
                withdraw();
            } else if (option == 3) {
                depositMoney();
            } else if (option == 4) {
                break;
            } else {
                System.out.println("Enter a valid choice");
            }
        }
    }

    public void checkBalance() {
        System.out.println("Balance: " + Balance);
    }

    public void withdraw() {
        System.out.println("Enter Amount to Withdraw: ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        if (amount > Balance) {
            System.out.println("Insufficient Balance");
        } else {
            Balance = Balance - amount;
            System.out.println("Money Withdrawal Successful");
        }
    }

    public void depositMoney() {
        System.out.println("Enter the amount: ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        Balance = Balance + amount;
        System.out.println("Money Deposited Successfully");
    }

}

public class ATMMachine {
    public static void main(String[] args) {

        ATM obj = new ATM();
        obj.checkpin();

    }
}

