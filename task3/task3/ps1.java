import java.util.*;

public class ps1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        System.out.println("Sum of array elements: " + sum);
        scanner.close();
    }
}

