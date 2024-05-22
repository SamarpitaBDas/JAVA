import java.util.Scanner;

public class ps3 {
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
        int[] oddArray = new int[size];
        int[] evenArray = new int[size];
        int oddCount = 0;
        int evenCount = 0;

        for (int num : array) {
            if (num % 2 == 0) {
                evenArray[evenCount++] = num;
            } else {
                oddArray[oddCount++] = num;
            }
        }
        System.out.println("Odd integers:");
        for (int i = 0; i < oddCount; i++) {
            System.out.print(oddArray[i] + " ");
        }
        System.out.println();
        System.out.println("Even integers:");
        for (int i = 0; i < evenCount; i++) {
            System.out.print(evenArray[i] + " ");
        }
        System.out.println();
        scanner.close();
    }
}

