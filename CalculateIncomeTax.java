package basicPrograms;

import java.util.Scanner;

public class CalculateIncomeTax {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		float tax = 0;
		float income = 0;
		System.out.println("Enter your income");
		income = sc.nextFloat();
		if(income<=250000) {
			System.out.println("You are not eligible for paying tax");
		}
		else if(income>250000 && income<=500000) {
			tax = (income*5)/100;
			System.out.println("Your tax is Rs"+tax);
		}
		else if(income>500000 && income<=1000000) {
			tax = (income*20)/100;
			System.out.println("Your tax is Rs"+tax);
		}
		else if(income>1000000) {
			tax = (income*30)/100;
			System.out.println("Your tax is Rs"+tax);
		}

	}

}
