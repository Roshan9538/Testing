package com.roshan.src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DuplicateValue {

	public static void main(String[] args) throws IOException {
		
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	System.out.println("Enter the number of elements");
	
	String x= br.readLine();
	//System.out.println(x);
	int number=Integer.parseInt(x);
	ArrayList<Integer> arr= new ArrayList<>();
	HashMap<Integer, Integer> hashmap= new HashMap<>();
	ArrayList<Integer> aaa= new ArrayList<>();
	HashMap<Integer, Integer> hashmap2= new HashMap<>();
	for(int i=1;i<=number;i++)
	{
		String  s= br.readLine();
		int num=Integer.parseInt(s);
		arr.add(num);
	}
	

	System.out.println(arr);
			for(int nos:arr)
			{
				
				if(hashmap.containsKey(nos))
				{
					hashmap.put(nos, hashmap.get(nos)+1);
				}
				else
				{
					hashmap.put(nos, 1);
				}
		
	
			
			//System.out.println("Duplicate value list :-"+hashmap);
	
	}
	for(Map.Entry<Integer, Integer> pair:hashmap.entrySet())
	{
		if(pair.getValue()!=1)
		{
			hashmap2.put(pair.getKey(), pair.getValue());
		}
	}
	System.out.println(hashmap2);
}
}