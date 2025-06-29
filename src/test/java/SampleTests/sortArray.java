package SampleTests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.xml.stream.events.Characters;

import org.testng.annotations.Test;

public class sortArray {

	@Test
	public void sorting()
	{
		Integer[] array = {10,2,1,3,43,55,67,90};
		Arrays.sort(array,Collections.reverseOrder());
		System.out.println(Arrays.asList(array));
		
	}
	
	@Test
	public void countOccurances()
	{
		int[] intArray = { 1,4,3,2,3,3,4,2,1,5,6,5,6,7,8,9,7,8,9,0,9,8,7,4,5,42,1};
		ArrayList<String> output = new ArrayList<String>();
		for(int i=0;i<intArray.length;i++)
		{
			int count = Collections.frequency(Arrays.asList(intArray), intArray[i]);
			System.out.println(count);
			String result = intArray[i] + " - "+count;
			if(!output.contains(result))
				output.add(result);
		}
		output.stream().forEach(n->System.out.println(n));
	}
	
	@Test
	public void reverseString()
	{
		String name = "ahannah";
		String revName = new StringBuilder(name).reverse().toString();
		if(name.equals(revName))
			System.out.println("Palindrome!!!");
		else
			System.out.println("Not Palindrome!!!");
	}
	
	@Test
	public void printCount()
	{
		String[] str = {"a","e","i","o","u"};
		for(String vowel:str)
			countVowels(vowel);
		
	}
	
	public void countVowels(String vowel)
	{
		String name = "AAEEaaeeIIiiOOooUUuuAEIOU";
		String count = vowel+" : "+name.toLowerCase().replaceAll("[^"+vowel+"]", "").length();
		System.out.println(count);
	}
	
	@Test
	public void displayPrime()
	{
		int count=0;
		for(int i=1;i<100;i++)
		{
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					count++;
					break;
				}
			}
			if(count>0)
			{
				System.out.println(i+" is prime!!!");
			}
		}
	}
}
	
	// baa5d89cc12d4702ba848a870d037b82

