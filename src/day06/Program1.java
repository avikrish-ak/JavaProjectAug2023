package day06;

public class Program1 {
	
	public static void main(String[] args) {
		add(10,20);
		sub(30,10);
		mul(3,2);
		div(10,3);
	}

	public static void add(int x,int y)
	{
		System.out.println(x+y);
	}
	
	private static void sub(int x,int y)
	{
		System.out.println(x-y);
	}
	
	protected static void mul(int x,int y)
	{
		System.out.println(x*y);
	}
	
	static void div(double x,int y)
	{
		System.out.println(x/y);
	}
	
}
