import java.util.Scanner;
public class p2 {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        System.out.print("enter a string ");
        String inputString = scanner.nextLine();
        int vowels=VowelCount(inputString);
        int len = findStringLength(inputString);
        int consonants = len-vowels;
        System.out.println("the number of vowels in string is :"+vowels+" and consonants is :"+consonants);
        scanner.close();
    }

    public static int VowelCount(String s){
        int count = 0;
        int len = findStringLength(s);
        char[] charArray = s.toCharArray();
        char[] vowels = {'a','e','i','o','u','A','E','I','U','O'};
        for(int i=0;i<len;i++){
            for(int j=0;j<10;j++){
                if(charArray[i]==vowels[j]){
                    count ++;
                }
            }
        }
        return count;
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
