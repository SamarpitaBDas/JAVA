import java.util.Scanner;

public class PS3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int originalNumber = number;
        int sum = 0;

        while (number != 0) {
            int digit = number % 10;
            int factorial = 1;

            for (int i = 1; i <= digit; i++) {
                factorial *= i;
            }

            sum += factorial;
            number /= 10;
        }

        if (sum == originalNumber) {
            System.out.println(originalNumber + " is a Krishnamurthy Number.");
        } else {
            System.out.println(originalNumber + " is not a Krishnamurthy Number.");
        }

        sc.close();
    }
}
