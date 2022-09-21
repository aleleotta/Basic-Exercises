package basicexercises;

import java.util.Scanner;

public class Exercise1 {
	public static void main(String[]args) {
		System.out.println("Type a number: ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("The following number was typed in: " + a);
		sc.close();
		
	}
}
