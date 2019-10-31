package com.mysample.app;

import java.util.ArrayList;

public class MethodRetainAll {
	
	public static void main(String args[]) {
		
		ArrayList<String> bags = new ArrayList<String>();
		bags.add("pen");
		bags.add("pencil");
		bags.add("paper");
		
		ArrayList<String> boxes = new ArrayList<String>();
		boxes.add("pen");
		boxes.add("pencil");
		boxes.add("eraser");
		boxes.add("books");
		
		System.out.println("bags:" + bags);
		System.out.println("boxes:" + boxes);
		
		//performs intersection
		boxes.retainAll(bags);
		System.out.println("boxes:" + boxes);
		
		
		
		
		
	}

}
