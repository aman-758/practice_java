package basicPrograms;
//a = 4, b = 8

import java.util.Scanner;

public class SwapTwoNumber {
	public static void main(String[] args) {
		int a,b;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		a = sc.nextInt();
		System.out.println("Enter the second number");
		b = sc.nextInt();
		//Main logic starts here
		a = a+b; //a=12
		b = a-b; //b=4
		a = a-b; //a=8
		System.out.println("After swapping two number\n");
		System.out.println("The first number became "+a);
		System.out.println("The second number became "+b);
		
	}
}
