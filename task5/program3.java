import java.util.Scanner;

public class program3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1:");
        int x = scanner.nextInt();
        System.out.println("Enter number 2:");
        int y = scanner.nextInt();
        swap(x, y);
        scanner.close();
    }

    public static void swap(int x, int y) {
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("Number 1: " + x);
        System.out.println("Number 2: " + y);
    }
}

