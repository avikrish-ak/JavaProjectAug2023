package day18;

import java.util.Arrays;
import java.util.LinkedList;

public class Program18 {

	public static void main(String[] args) {
		LinkedList<Integer> x = new LinkedList<>();
		
		x.add(10);//0 insert at last
		x.add(20);//1
		x.add(30);//2
		x.add(40);//3
		System.out.println(x);
		
		x.add(2, 102030);// insert by index
		System.out.println(x);
		
		x.addAll(Arrays.asList(11,12,13));//insert grp of value
		System.out.println(x);

		x.addAll(2,Arrays.asList(11,12,13));//insert grp of value by index
		System.out.println(x);

		
		x.addFirst(123);// insert at first
		System.out.println(x);
		
		x.addLast(456);//insert at last
		System.out.println(x);
		
		
		System.out.println(x.get(2));//20 // get value from list
		
		System.out.println(x.getFirst());//123 get first value 
		
		System.out.println(x.getLast());//456 get last value
		
		System.out.println(x.size()); // get length of list
		
		System.out.println(x.contains(123));//true  value is exist or not
		
		System.out.println(x.contains(321));//false
		
		System.out.println(x.containsAll(Arrays.asList(11,12,13)));//true
		
		System.out.println(x.containsAll(Arrays.asList(111,222,13)));//false
		System.out.println(x);
		x.set(3, 111);
		System.out.println(x);
		
		System.out.println(x.indexOf(102030));//6 get index of value
		
		/*
		 System.out.println(x.isEmpty());//false
		 
		
		x.clear();
		
		System.out.println(x);//[]
		
		System.out.println(x.isEmpty());//true
		*/
		
		System.out.println(x.remove());
		System.out.println(x);
		System.out.println(x.remove(2));
		System.out.println(x);
		
		x.removeAll(Arrays.asList(11,12,13));
		System.out.println(x);
		
		System.out.println(x.removeFirst()); // remove first value 
		
		System.out.println(x.removeLast()); // remove last value
		
		System.out.println(x);
		
		System.out.println(x.peek());//get data from list
		
		System.out.println(x.peekFirst());
		
		System.out.println(x.peekLast());
		
		System.out.println(x);
		
		System.out.println(x.poll());//20 remove value in list
		
		System.out.println(x.pollFirst());//102030
		
		System.out.println(x.pollLast());//40
		
		System.out.println(x);//[30]
		
		x.push(40);// insert at first 
		System.out.println(x);//40,30
		x.push(50);
		System.out.println(x);//50,40,30
	}

}
