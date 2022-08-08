package basicPrograms;

import java.util.Scanner;

public class StudentPassOrFail {

	public static void main(String[] args) {
		int marks1 = 0,marks2 = 0,marks3 = 0;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your three subject marks:");
		System.out.println("English ");
		marks1 = sc.nextInt();
		System.out.println("Hindi ");
		marks2 = sc.nextInt();
		System.out.println("Computer ");
		marks3 = sc.nextInt();
		float avg = (marks1+marks2+marks3)/3.0f;
		if(avg>=33&&marks1>=33&&marks2>=33&&marks3 >= 33) {
			System.out.println("Student is pass!!");
			System.out.println("Because their marks is "+avg);
		}
		else {
			System.out.println("Student is fail!!");
			System.out.println("student is fail because their avg marks is "+avg);
		}
	}

}
