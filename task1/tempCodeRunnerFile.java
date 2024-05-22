
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

        // System.out.print("Enter first number: ");
        // int a = scanner.nextInt();
        // System.out.print("Enter second number: ");
        // int b = scanner.nextInt();
        // System.out.print("Enter third number: ");
        // int c = scanner.nextInt();
//         int max;
//         if(a>b){
//             if(a>c){
//                 max=a;
//             }
//             else{
//                 max=c;
//             }
//         }
//         else{
//             if(b>c){
//                 max=b;
//             }
//             else{
//                 max=c;
//             }
//         }
//         System.out.print("maximum number is: ");
//         System.out.print(max);
//         scanner.close();
//     }
// }
// 3. WAP to check whether a triangle is Equilateral, Isosceles or Scalene.
// import java.lang.System;
// import java.util.*;

// public class task1 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter first side: ");
//         int a = scanner.nextInt();
//         System.out.print("Enter second side: ");
//         int b = scanner.nextInt();
//         System.out.print("Enter third side: ");
//         int c = scanner.nextInt();
//         if(a==b && b==c){
//             System.out.print("the triangle is equilateral ");
//         }
//         else if ((a!=b && b==c)||(a==b && b!=c)){
//             System.out.print("the triangle is Isosceles ");
//         }
//         else{
//             System.out.print("the triangle is Scalene ");
//         }
//         scanner.close();
//     }
// }

// 4. WAP to create Simple Calculator using switch case.
// import java.lang.System;
// import java.util.*;

// public class task1 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//                 System.out.print("Enter first number: ");
//         int a = scanner.nextInt();
//         System.out.print("Enter second number: ");
//         int b = scanner.nextInt();
//         scanner.nextLine();
//         System.out.print("Enter an operator (+, -, *, /): ");
//         String operator = scanner.nextLine();

//         switch (operator){
//             case "+":
//                 System.out.print(a+b);break;
//             case "-":
//                 System.out.print(a-b);break;
//             case "*":
//                 System.out.print(a*b);break;
//             case "/":
//                 System.out.print(a/b);break;
//             case "%":
//                 System.out.print(a%b);break;
//             default:
//                 System.out.print("error");break;
//         }