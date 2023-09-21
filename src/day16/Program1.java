package day16;

import java.util.Arrays;
import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the Size of Array :- ");
		int size= scan.nextInt();
		
		int y[] = new int[size];
		
		for(int i=0;i<size;i=i+1)
		{
			System.out.println("Enter the Value:- ");
			int value=scan.nextInt();
			y[i]=value;
		}
		
		System.out.println(Arrays.toString(y));
	}

}
