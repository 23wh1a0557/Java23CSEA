package helloworld;

import java.util.Scanner;

public class arithmetic_op {

	public static void main(String[] args) {
						 Scanner s = new Scanner(System.in);
						 System.out.println("enter a number a: ");
						 int c = s.nextInt();
						 System.out.println("Enter a number b: ");
						 int d = s.nextInt();
						 int n = c+d;
						 int sub = c-d;
						 int div = c/d;
						 int mul = c*d;
						 System.out.println("The sum of numbers is:" + n);
						 System.out.println("The difference of numbers is:" + sub);
						 System.out.println("The division of numbers is:" + div);
						 System.out.println("The product of numbers is:" + mul);      
					}	
	}
