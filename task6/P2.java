import java.util.*;

public class P2 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();
        System.out.println("The Fibonacci series is:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        scanner.close();
    }
    
    public static int fibonacci(int n){
        if(n < 2){
            return n;
        }
        else{
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
}
