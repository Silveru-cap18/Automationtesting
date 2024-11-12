package cap;
import java.util.Scanner;

public class Caluculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         System.out.println("simple calculator");
         System.out.println("enter first number: ");
         double num1=sc.nextDouble();
         
         System.out.println("enter second number: ");
         double num2=sc.nextDouble();
		
         System.out.println("Select an operation:");
         System.out.println("1. Addition (+)");
         System.out.println("2. Subtraction (-)");
         System.out.println("3. Multiplication (*)");
         System.out.println("4. Division (/)");
           
         int choice= sc.nextInt();
         double result;
         
         
         switch (choice) {
         case 1:
         result=num1+num2;
         System.out.println("Result: "+num1+"+"+num2+"="+result);
         break;
         
         case 2:
             result = num1 - num2;
             System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
             break;
         case 3:
             result = num1 * num2;
             System.out.println("Result: " + num1 + " * " + num2 + " = " + result);
             break;
         case 4:
             if (num2 != 0) {
                 result = num1 / num2;
                 System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
             } else {
                 System.out.println("Error: Division by zero is not allowed.");
             }
             break;
             default:
        	 System.out.println("Invalid operation selected.");
         }
         
         // Close the scanner
         sc.close();
		
		
	}

}
