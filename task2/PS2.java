import java.util.*;

public class PS2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            int multiple = a * i;
            System.out.println(a + " * " + i + " = " + multiple);
        }

        sc.close();
    }
}
