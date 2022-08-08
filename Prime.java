package basicPrograms;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,j,num;
		int count;
		System.out.println("Enter the range of the number ");
		num = sc.nextInt();
		
		for(i = 1;i<=num;i++) {
			
			count = 0;
			
			for(j = 1;j<=i;j++) {
				
				if(i%j == 0) {
					count++;
				}
			}
		
			if(count == 2) {
			System.out.println(i);
			}
	}
}
}
