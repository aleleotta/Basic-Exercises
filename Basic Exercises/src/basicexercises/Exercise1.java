package basicexercises;

import java.util.Scanner;
import java.util.Locale;

public class Exercise1 {
	public static void main(String[]args) {
		System.out.println("Input your age: ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("Age: " + a);
		sc.close();
	}
}
