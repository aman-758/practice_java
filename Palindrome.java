package basicPrograms;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		int num,rev = 0,dummy,rem;
		System.out.println("Enter the number");
		num = sc.nextInt();
		dummy = num;
		while(num!=0) {
			rem = num%10; // rem = 1234%10 = 4
			rev = rev*10+rem; // rev = 0*10+4 = 4
			num = num/10;
		}
		System.out.println(rev);
		if(dummy == rev) {
			System.out.println("Number is palindrome");
		}
		else {
			System.out.println("Number is not palindrome");
		}
	}
}
