import java.util.Scanner;

public class SimpleCalculator{

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:");

        double num1 = sc.nextDouble();

        System.out.println("Enter second number:");

        double num2 = sc.nextDouble();

        System.out.println("Enter the Operations (+, -, *, /):");

        switch (sc.next().charAt(0)) {
           case '+':
           System.out.println("The sum is:" + (num1 + num2));
           break;

           case '-':
           System.out.println("The difference is:" + (num1 - num2));
           break;
           
           case '*':
           System.out.println("The product is:" + (num1 * num2));
           break;

           case '/':
           if(num2 !=0){
            System.out.println("The division is:" + (num1 / num2));
           } else {
            System.out.println("Error : Division by Zero");
           }
           break;
           default:
           System.out.println("invalid operation");
           break;
        }
        sc.close();
    }
    
}