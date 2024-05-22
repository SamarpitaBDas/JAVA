import java.util.Scanner;
public class program2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("enter a binary number number");
        String  x= scanner.nextLine();
        int dec=Binaryconvo(x);
        System.out.println("the resultant decimal number is " +dec);
        scanner.close();
    }
    public static int Binaryconvo(String x){
        int decimal=0;
        int power=0;
        for (int i=x.length()-1;i>=0;i--){
            int digit=x.charAt(i)-'0';
            decimal+=digit*Math.pow(2,power);
            power++;
        }
        return decimal;
    }
}
