package day10;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		System.out.println("__________");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter value of a:- ");
		int a=scan.nextInt();
		System.out.println("Enter value of b:- ");
		int b=scan.nextInt();
		scan.close();

		if(a>b)
		{
			System.out.println("a is greater than b");	
		}
		else if(b>a)
		{
			System.out.println("b is greater than a");
		}
		else if(b==a)
		{
			System.out.println("b & a are equal");
		}
		System.out.println("#############");
	}

}
