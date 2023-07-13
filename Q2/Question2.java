package Q2;

import java.util.Scanner;

public class Question2 {
	public static void main(String[] args) {
		System.out.print("Enter number to print table: ");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " x " + i + " = " + (num * i));
		}
	}
}
