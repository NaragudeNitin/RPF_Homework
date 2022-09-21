package Day1;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		int year;
		System.out.println("Enter value: ");
		Scanner sc = new Scanner(System.in);
		year = sc.nextInt();
		if (((year % 4 == 0) || (year % 400 == 0)) && (year >= 1582)) {
			System.out.println(year + " year is leap year");
		} else {
			System.out.println("This Special year is not leap year");
		}
		sc.close();
	}
}
