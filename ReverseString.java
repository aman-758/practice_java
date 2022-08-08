package basicPrograms;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		String string;
		int length,i;
		String reverse = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String ");
		string = sc.nextLine();
		length = string.length();
		for(i = length-1;i>=0;i--) {
			reverse = reverse+string.charAt(i);
		}
		System.out.println(string+" Reversed string "+reverse);
	}
}
