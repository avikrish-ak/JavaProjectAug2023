package day16;

import java.util.Arrays;
import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		
		
		int y[] = {10,30,20,50,20,60};
		
		int minValue=y[0]; 
		
		for(int i=1;i<y.length;i=i+1)
		{
			if(y[i]<minValue)
			{
				minValue=y[i];
			}
		}
		
		System.out.println(minValue);
		
	}

}
