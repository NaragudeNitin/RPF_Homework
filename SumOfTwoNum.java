package Day1;

import java.util.Scanner;

public class SumOfTwoNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = sc.next();
		System.out.println("you have Entered : " + name);
		System.out.println("Enter first no: ");
		int a = sc.nextInt(); 	

		System.out.println("Enter second no: ");
		int b = sc.nextInt();

		int sum = a + b;
		System.out.println("Sum of " + a + " & " + b + " is " + sum);

		sc.close();

	}
}
