import java.util.Scanner;
public class P4 {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        System.out.print("enter a string ");
        String inputString = scanner.nextLine();
        String ms =VowelUpper(inputString);
        System.out.println("the modified sting is : " +ms);
        scanner.close();
    }

    public static String VowelUpper(String s){
        int len = findStringLength(s);
        String ms ="";
        char[] charArray = s.toCharArray();
        char[] vowels = {'a','e','i','o','u','A','E','I','U','O'};
        for(int i=0;i<len;i++){
            boolean isvowels = false;
            for(int j=0;j< vowels.length;j++){
                if(charArray[i]==vowels[j]){
                    ms += Character.toUpperCase(charArray[i]);
                    isvowels = true;
                    break;
                }
            }
            if(!isvowels) {
                ms += charArray[i];
            }
        }
        return ms;
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
