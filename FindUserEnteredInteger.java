package basicPrograms;

import java.util.Scanner;

public class FindUserEnteredInteger {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the integer number");
		System.out.println(sc.hasNextInt());
	}
}
