package day19;

import java.util.*;

public class Program1 {

	public static void main(String[] args) {
		Set<Integer> x= new TreeSet<>();
		x.addAll(Arrays.asList(10,20,30,40,10,20,30,40));
		System.out.println(x);

		x.add(100);
		System.out.println(x);
		
		x.remove(40);
		System.out.println(x);
		
		x.removeAll(Arrays.asList(20,30,50));
		System.out.println(x);
		
		
		Set<Integer> a= new TreeSet<>(Arrays.asList(40,30,10,60));
		Set<Integer> b= new TreeSet<>(Arrays.asList(60,30,10,50));
		
		a.retainAll(b);
		System.out.println(a);
		
		System.out.println(b.contains(40));
		
		System.out.println(b.contains(60));
		
		System.out.println(b.containsAll(Arrays.asList(20,30,10)));
		System.out.println(b.containsAll(Arrays.asList(50,30,10)));
		
		
		System.out.println(b.isEmpty());
		b.clear();
		System.out.println(b.isEmpty());
		
	}

}
