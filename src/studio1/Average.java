package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The first of two integers to be averaged?");
		Scanner in = new Scanner(System.in);
		int a,b;
		a = in.nextInt();
		System.out.println("The second of two integers to be averaged?");
		b = in.nextInt();
		System.out.println("Average of " + a + " and " + b + " is " + (a+b)/2.0 + ".");
	}

}
