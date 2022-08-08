package basicPrograms;

import java.util.Scanner;

public class Table {
	public static void main(String[] args) {
		
		int num,i,range;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number ");
		
		num = sc.nextInt();
		
		System.out.println("Enter the range ");
		
		range = sc.nextInt();
		
		for(i = 1;i<=range;i++) {
			System.out.println(num+" * "+i+" = "+num*i);
		}
		
	}
}
