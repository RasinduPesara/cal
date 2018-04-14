package Assigment;

import java.util.Scanner;

public class A3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	       int n1 = 0;
	       int n2 = 0;
	       int tot = 0;
	       
	       System.out.println("* : For multiplication \n / : For division \n + : For addtion \n - : For Subtraction");
	       
	       System.out.println("Enter your first number : ");
	       n1 = sc.nextByte();
	       
	       System.out.println("Enter your secound number : ");
	       n2 = sc.nextByte();
	       
	       System.out.println("Enter your calculation method : ");
	       String calc = sc.next();
	       
	       if (calc == "*") {
	          tot = n1 * n2;
	          System.out.println("Your total is : " + tot); 
	       } else if (calc.contains("/")) {
	           tot = n1 * n2;
	           System.out.println("Your total is : " + tot); 
	       } else if (calc.contains("+")) {
	           tot = n1 + n2;
	           System.out.println("Your total is : " + tot); 
	       } else if (calc.contains("-")) {
	           tot = n1 - n2;
	           System.out.println("Your total is : " + tot); 
	       } else {
	           System.exit(0);
	       }
	       

	}

}
