import java.util.*;

public class PS1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter a number:");
            int num = sc.nextInt();
            sum += num;
        }

        System.out.print("Sum is: ");
        System.out.println(sum);

        int average = sum / 10;
        System.out.print("Average is: ");
        System.out.println(average);
        
        sc.close();
    }
}
