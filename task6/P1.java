import java.util.*;

// 1. WAP to find sum of numbers from 1 to n using recursion.

public class P1 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("enter the nth term");
        int n=scanner.nextInt();
        int sum=Sum(n);
        System.out.println("Sum of numbers: "+sum);
        scanner.close();
    }
    public static int Sum(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        return sum;
    }
}
