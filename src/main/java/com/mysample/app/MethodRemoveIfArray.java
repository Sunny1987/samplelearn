package com.mysample.app;

import java.util.ArrayList;

public class MethodRemoveIfArray {
	
	public static void main(String args[]) {
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(12);
		numbers.add(13);
		numbers.add(14);
		numbers.add(15);
		numbers.add(16);
		
		System.out.println("numbers:"+numbers);
		
		numbers.removeIf(n -> (n % 2== 0));
		
		System.out.println("numbers:"+numbers);
		ArrayList<String> names = new ArrayList<String>();
		names.add("Sunny");
		names.add("Madhu");
		names.add("Sabya");
		
		
		names.removeIf(name -> (name.charAt(0) == 'S'));
		
		//Integer[] arr = new Integer();
		
	}

}
