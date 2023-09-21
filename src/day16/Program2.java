package day16;

import java.util.Arrays;
import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		
		
		int y[] = {100,30,20,50,20,60};
		
		for(int i=0;i<y.length;i=i+1)
		{
			System.out.println(y[i]);
		}
		System.out.println("$$$$$$$$$$");
		for(int i=y.length-1;i>=0;i=i-1)
		{
			System.out.println(y[i]);
		}
		System.out.println("$$$$$$$$$$");
		for(int x:y)
		{
			System.out.println(x);
		}

		System.out.println(Arrays.toString(y));
	}

}
