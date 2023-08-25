package day05;

public class Program2 {

	public static void main(String[] args) {
		Program2 x= new Program2();
		x.add(10,20);
		x.sub(110,201);
		x.mul(130,420);
		x.div(1110,2201);
	}
	
	public void add(int x,int y)
	{
		System.out.println(x+y);
	}
	
	public void sub(int x,int y)
	{
		System.out.println(x-y);
	}
	
	public void mul(int x,int y)
	{
		System.out.println(x*y);
	}
	
	public void div(double x,int y)
	{
		System.out.println(x/y);
	}
	
	
	

}
