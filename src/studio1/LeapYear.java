package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int year=0;
		year = in.nextInt();
		System.out.println(year + " is a leap year: " + ((((year%4==0) && (year%100!=0)) || (year%400==0)) ? "true" : "false"));
	}

}
