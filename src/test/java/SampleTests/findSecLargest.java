package SampleTests;

import java.util.Arrays;
import java.util.Collections;

import org.testng.annotations.Test;

import java.util.ArrayList;

public class findSecLargest {

	@Test
	public void sorting()
	{
		ArrayList<Integer> array = new ArrayList<Integer>(Arrays.asList(23,3435,656,12,98,0,954,22,123,345));
		 Object[] sortedArray = array.stream().sorted().toArray();
		
	}
	@Test
	public void checkRepeat()
	{
		int count=1;
		ArrayList<String> strArray = new ArrayList<String>(Arrays.asList("Harry","Potter","Harry","Novel","Potter"));
		for(int i=0;i<strArray.size();i++)
		{
			count = Collections.frequency(strArray, strArray.get(i));
			if(count==1)
			{
				System.out.println(strArray.get(i)+" is not repeated ");
			
			}
			else 
				
				System.out.println(strArray.get(i)+" is repeated "+count+" times");
		}
		
	}
	 
	
	
	
}
