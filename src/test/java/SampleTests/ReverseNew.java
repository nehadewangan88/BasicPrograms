package SampleTests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Stream;

import org.testng.Assert;

public class ReverseNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ReverseNew rev = new ReverseNew();
		rev.palindrome();
		System.out.println("****************************************************************************************************************************");
		rev.secondLargetInArray();
		System.out.println("****************************************************************************************************************************");
		rev.countCharOccurances();
		System.out.println("****************************************************************************************************************************");
		rev.removeDuplicates();
		System.out.println("****************************************************************************************************************************");
	}
	
	
	
	public void palindrome()
	{
	
		String name = "HannaH";
		String newName = new StringBuilder(name).reverse().toString();
		if(name.equalsIgnoreCase(newName))
			System.out.println("Palindrome!!!");
		else
			System.out.println("Not Palindrome!!!");
	}
	
	public void secondLargetInArray()
	{
		int[] numbers = {10,88,91,0,23,11,23,45};
		Arrays.sort(numbers);
		for(int i=0;i<numbers.length;i++)
			System.out.println(numbers[i]);
		int secondLargest = numbers[numbers.length-2];
		System.out.println(Arrays.toString(numbers));
		System.out.println(secondLargest);
	}
	
	public void countCharOccurances()
	{
		String name = "William";
		ArrayList<String> result = new ArrayList<String>();
		ArrayList<Character> nameArray = new ArrayList<Character>();
		ArrayList<String> resultSet = new ArrayList<String>();
		
		/*	for(int i=0;i<name.length();i++)
		{
			char target = name.charAt(i);
			
			long val = name.chars().filter(c->c==target).count();
			String value = name.charAt(i)+" - "+val;
			if(!result.contains(value))
				result.add(value);   
		   
		 	
	
		}
		System.out.println(result); */
//		    Or
		for(int i=0;i<name.length();i++)
			nameArray.add(name.charAt(i));
					
		System.out.println(nameArray);
		for(int i=0;i<nameArray.size();i++)
		{
			char val = nameArray.get(i);
			long count = nameArray.stream().filter(n->n==val).count();
			System.out.println("Count of " +val+ " is:"+count);
			resultSet.add(val+"-"+count);
			
		}
		Object[] distinctResultSet = resultSet.stream().distinct().toArray();
		
		System.out.println(Arrays.toString(distinctResultSet));
		
		for(int i=0;i<nameArray.size();i++)
		{
			int count = Collections.frequency(nameArray, nameArray.get(i));
			String target = nameArray.get(i)+" - "+count;
			result.add(target);
		}
		Object[] distnctList = result.stream().distinct().toArray();
		System.out.println(Arrays.toString(distnctList));
			
	}
	
	public void removeDuplicates()
	{
		Integer[] numbers = {10,20,11,90,23,11,11,23,90,98,99,98,99};
		List<Integer> num = new ArrayList<Integer>(Arrays.asList(numbers));
		Object[] distnctList = num.stream().distinct().toArray();
		System.out.println(Arrays.toString(distnctList));
	}
	

}
