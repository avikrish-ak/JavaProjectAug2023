package day17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program1 {

	public static void main(String[] args) {
		List<Integer> x= new ArrayList<>();
		x.add(10);//0
		x.add(20);//1
		x.add(30);//2
		x.add(40);//3
		System.out.println(x);
		
		x.add(2, 102030);
		System.out.println(x);
		
		
		Integer[] y= {110,120,130,140,150};
		x.addAll(Arrays.asList(y));
		
		System.out.println(x);
		
		x.addAll(1, Arrays.asList(11,12,13,14,15));
		System.out.println(x);
		
		System.out.println(x.size());
		
		System.out.println(x.get(2));
		System.out.println(x.get(4));
		
		x.remove(1);
		
		System.out.println(x);
		
		System.out.println(x.size());
		
		x.removeAll(Arrays.asList(11,12,13,14,15));
		System.out.println(x);
		
		System.out.println(x.contains(11));
		System.out.println(x.contains(20));
		
		System.out.println(x.containsAll(Arrays.asList(10,20,30,40)));
		System.out.println(x.containsAll(Arrays.asList(10,20,30,40,50,60,70)));
		
		/*
		System.out.println(x.isEmpty());
		x.clear();
		System.out.println(x);
		System.out.println(x.isEmpty());
		*/
		
		System.out.println(x.indexOf(20));
		System.out.println(x.indexOf(120));
		System.out.println(x.indexOf(111120));
		
		
		x.set(1, 456456);
		System.out.println(x);
		
		System.out.println(x.get(1));
		
	}

}
