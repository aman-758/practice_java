package basicPrograms;

import java.util.Scanner;

public class SomeEvenNumber {
	public static void main(String[] args) {
		int num,sum = 0;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number ");
		num = sc.nextInt();
		for(int i = 1;i<=num;i++) { //Get all the number from 1 to num
			if(i%2==0) { //This condition filters all the odd number and get even number
				sum = sum+i; //if user will enter 10 number so, 0 = 0+2...4....6....8...10 
				System.out.println(i);
			}
		}
		System.out.println();
		System.out.println("Total sum of even number is "+sum);
	}
}
