package basicPrograms;

public class Factorial {
	public static void main(String[] args) {
		int fact = 1;
		for(int i = 1;i<=5;i++) {
			fact=fact*i; //0 = 1,2,6,24,5 = 120 
		}
		System.out.println("The factorial of the given number is "+fact);
	}
}
