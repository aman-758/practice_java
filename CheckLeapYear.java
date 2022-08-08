package basicPrograms;

import java.util.Scanner;

public class CheckLeapYear {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int year = 0;
		System.out.print("Enter the year ");
		year = sc.nextInt();
		if(year%100 == 0) {
			System.out.println(year+" is not a leap year");
		}
		else if(year%4 == 0) {
			System.out.println(year+" is a leap year");
		}
		else if(year%400 == 0) {
			System.out.println(year+" is a leap year");
		}
		else {
			System.out.println(year+" is not a leap year");
		}
	}

}
