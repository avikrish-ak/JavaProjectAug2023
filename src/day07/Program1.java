package day07;

public class Program1 {

	public static void main(String[] args) {
		Program1 x= new Program1();
		x.add(10, 20);
		x.sub(30, 10);
		x.mul(10, 20);
		x.div(20, 3);

	}
	
	public void add(int x,int y)
	{
		System.out.println(x+y);
	}
	
	private void sub(int x,int y)
	{
		System.out.println(x-y);
	}
	
	protected void mul(int x,int y)
	{
		System.out.println(x*y);
	}
	
	void div(double x,int y)
	{
		System.out.println(x/y);
	}
}
