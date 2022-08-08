package basicPrograms;

public class SumMultiplicationTable {

	public static void main(String[] args) {
		int i;
		int num = 8;
		int sum = 0;
		for(i = 1;i<=10;i++) {
			System.out.println(num+" * "+i+" = "+num*i);
			sum = sum + num*i;
		}
		
		System.out.println("Sum of the multiplication table of 8 is "+sum);
	}

}
