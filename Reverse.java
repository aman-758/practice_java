package basicPrograms;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		int rev = 0,num,rem;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		num = sc.nextInt();
		int dummy = num;
		while(num>0) {
			rem = num%10;
			rev = rev*10+rem;
			num = num/10;
		}
		System.out.println("Reverse of  the "+dummy+" is "+rev);
	}
}
