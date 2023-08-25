package day03;

public class Program1 {

	public static void main(String[] args) {
		System.out.println("Good Day..!");
		Program1 x = new Program1();
		x.display1();
		display2();
		display3();
		display4();
	}

	private void display1()
	{
		System.out.println("Good Morning..!");
	}

	protected static void display2()
	{
		System.out.println("Java..!");
	}

	static void display3()
	{
		System.out.println("Selenium..!");
	}

	public static void display4()
	{
		System.out.println("Selenium Java..!");
	}

}
