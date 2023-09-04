package day14;

public class Program2 {

	public static void main(String[] args) {
		/*
		 54321
		 4321
		 321
		 21
		 1
		 */
		
		for(int a=5;a>=1;a=a-1)
		{
		for(int b=a;b>=1;b=b-1)
		{
			System.out.print(b);
		}
		System.out.println();
		}
		
		/*
		 1
		 21
		 321
		 4321
		 54321
		 */
		
		for(int a=1;a<=5;a=a+1)
		{
		for(int b=a;b>=1;b=b-1)
		{
			System.out.print(b);
		}
		System.out.println();
		}
		
		
	}

}
