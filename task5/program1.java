import java.util.Scanner;

public class program1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int x = square(num);
        System.out.println("The square of the number is " + x);
        scanner.close();
    }

    public static int square(int x) {
        return x * x;
    }
}
