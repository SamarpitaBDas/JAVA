import java.util.*;
//sum of digits using recursion
public class P3 {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the number");
        int num=scanner.nextInt();
        int sum=digitsum(num);
        System.out.println("the sum of the digits is: "+sum);
        scanner.close();
    }
    public static int digitsum(int num){
        if(num==0){
            return 0;
        }
        else{
            int r=num%10;
            return r+digitsum(num/10);
        }
    }
}
