import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        int length = findStringLength(inputString);
        System.out.println("The length of the string '" + inputString + "' is " + length + ".");
        scanner.close();
    }

    public static int findStringLength(String s) {
        int count = 0;
        int index = 0;
        char[] charArray = s.toCharArray();
        while (true) {
            if (index >= 0 && index < charArray.length) {
                count++;
                index++;
            } else {
                break;
            }
            
        }
        return count;
    }
}
