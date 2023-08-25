package day05;

public class Program4 {

	public static void main(String[] args) {	
		add(10,20);
		add(10,20,30);
		add(1.5,1.2);
		
	}
	
	public static void add(int x,int y)
	{
		System.out.println(x+y);
	}
	
	public static void add(double x,double y)
	{
		System.out.println(x+y);
	}
	
	public static void add(int x,int y,int z)
	{
		System.out.println(x+y+z);
	}
	
	

}
