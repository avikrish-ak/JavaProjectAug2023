package day20;

import java.util.*;

public class Program1 {

	public static void main(String[] args) {
		Map<String,Integer> x = new HashMap<>();
		//insert and update
		x.put("abc", 101);
		x.put("bcd", 102);
		x.put("cde", 103);
		
		System.out.println(x);
		
		x.put("abc", 105);
		x.put("bcd", 106);
		x.put("cde", 107);
		x.put("def", 107);
		System.out.println(x);
		
		//update
		x.replace("abc", 110);
		System.out.println(x);
		
		x.replace("aaa", 150);
		System.out.println(x);
		
		x.remove("abc");
		System.out.println(x);
		
		x.remove("bcd", 106);
		System.out.println(x);
		
		System.out.println(x.isEmpty());//false
		
		x.clear();
		
		System.out.println(x.isEmpty());//true
		
		
		
		
	}

}
