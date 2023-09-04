package day15;

import java.util.Arrays;

public class Program1 {

	public static void main(String[] args) {
		int[] x = new int[10];
		
		//indexing -start from zero
		//0-9
		x[0]=123;
		x[3]=456;
		x[1]=234;
		x[6]=789;
				
		System.out.println(x[0]);
		System.out.println(x[1]);
		System.out.println(x[2]);//0
		x[1]=555;
		System.out.println(x[1]);
		
		x[9]=3456;
		System.out.println(x[9]);
		
		
		System.out.println(x.length);
		System.out.println("##########");
		for(int index=0;index<x.length;index=index+1)
		{
			System.out.println(x[index]);
		}
		
		System.out.println("##########");
		
		for(int y:x)
		{
			System.out.println(y);
		}
		
		int[] z= x;
		System.out.println(z);
		System.out.println(x);
		
		z[0]=123123;
		System.out.println(z[0]);
		System.out.println(x[0]);
		
		int[] a= Arrays.copyOf(x, x.length);
		
		System.out.println(a);
		System.out.println(x);
		
		a[0]=456456;
		System.out.println(a[0]);
		System.out.println(x[0]);
		
		System.out.println(Arrays.toString(x));
		Arrays.sort(x);
		
		System.out.println(Arrays.toString(x));
		
		
		System.out.println(Arrays.compare(x, z));
		System.out.println(Arrays.compare(x, a));
		System.out.println(Arrays.compare(a, x));
		System.out.println(Arrays.toString(x));
		System.out.println(Arrays.toString(a));
		
		
		//(a,b) a is greater than b--->1
		//(a,b) a is lesser than b--->-1
		//(a,b) a is equal to b--->0
		
		
		
	}

}
