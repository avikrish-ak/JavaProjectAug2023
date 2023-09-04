package day14;

public class Program1 {

	public static void main(String[] args) {
		/*
		 1
		 12
		 123
		 1234
		 12345
		 */
	
		for(int a=1;a<=5;a=a+1)
		{
		for(int i=1;i<=a;i=i+1)
		{
			System.out.print(i);
		}
		System.out.println();
		}
		
		/*
		 12345
		 1234
		 123
		 12
		 1
		 */
		
		for(int a=5;a>=1;a=a-1)
		{
		for(int i=1;i<=a;i=i+1)
		{
			System.out.print(i);
		}
		System.out.println();
		}
		
		
	}

}
