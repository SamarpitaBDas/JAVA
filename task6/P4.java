
import java.util.Scanner;

public class P4 {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a number");
        int num=scanner.nextInt();
        System.out.println("enter another number");
        int num2=scanner.nextInt();
        int gcd=GCD(num,num2);
        System.out.println("the gc of the number is: "+gcd);
        scanner.close();
    }
    public static int GCD(int num,int num2){
        if(num2==0){
            return num;
        }

        else{
            return GCD(num2,num%num2);
        }
    }
}
