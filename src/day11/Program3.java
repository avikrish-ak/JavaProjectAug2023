package day11;

import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Value:-  ");
		String x=scan.next();
		scan.close();
		
		switch (x) {
		case "1": 
			System.out.println("SUN");
			break;
		case "2": 
			System.out.println("MON");
			break;
		case "6": 
			System.out.println("FRI");
		case "7": 
			System.out.println("SAT");
		default:
			System.out.println("Invalid Selection Day..!");
			break;
		case "3": 
			System.out.println("TUE");
			break;
		case "4": 
			System.out.println("WEN");
			break;
		case "5": 
			System.out.println("THUR");
			break;
		
		}

	}

}
