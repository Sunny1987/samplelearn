package com.mysample.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class App 
{
    public static void main( String[] args )
    {
    	    
    	//remove duplicates and sort an array
    	removeDuplicateAndSort();
    	
    	

    	
    	
    	
    	
    	
        
    }

	private static void removeDuplicateAndSort() {
		
		//using set interface and HashSet to remove duplicates and then transfer back to ArrayList
		
		// declaring am array of type int[]
    	int[] arr = {1,2,3,3,1,4,6,5,6};
    	
    	//declare a list of ArrayList and push array into arrayList
    	List<Integer> list = new ArrayList<Integer>();
    	for(int x : arr) {
    		
    		list.add(x);
    	}
    	
    	//display the arrayList
    	System.out.println(list);
    	
    	//declare a set/hashset and assign it with arrayList value to remove duplicates
    	Set<Integer> set = new HashSet<Integer>(list);
    	
    	
    	list.clear();
    	
    	//insert the set values back in list
    	list.addAll(set);
    	
    	//sort the list as set is unordered collection
    	Collections.sort(list);
    	System.out.println(list);
		
		
	}
}
