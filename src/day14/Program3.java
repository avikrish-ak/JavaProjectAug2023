package day14;

public class Program3 {

	public static void main(String[] args) {
		/*
		 54321
		 5432
		 543
		 54
		 5
		 */
		
		
		for(int a=1;a<=5;a=a+1)
		{
		for(int b=5;b>=a;b=b-1)
		{
			System.out.print(b);
		}
		System.out.println();
		}
	
		
		for(int a=5;a>=1;a=a-1)
		{
		for(int b=5;b>=a;b=b-1)
		{
			System.out.print(b);
		}
		System.out.println();
		}
	
		
		
		
	}

}
