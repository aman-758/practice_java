package basicPrograms;

import java.util.Scanner;

public class WebsiteType {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the website short type ");
		String type = sc.nextLine();
		if(type.endsWith(".com")) {
			System.out.println("Site is commericial");
		}
		else if(type.endsWith(".org")) {
			System.out.println("Organization site");
		}
		else if(type.endsWith(".in")) {
			System.out.println("Indian website");
		}
		else {
			System.out.println("Invalid or not in the list "+type);
		}
	}

}
