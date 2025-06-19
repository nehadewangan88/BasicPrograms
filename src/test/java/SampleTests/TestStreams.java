package SampleTests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import org.testng.annotations.Test;
public class TestStreams {
	
/*	public void takeDataInput()
	{
		ArrayList<String> names = new ArrayList<String>();
		names.add("Adam");
		names.add("Billy");
		names.add("Cinthia");
		names.add("Emily");
		names.add("Berlin");
		names.add("Eve");

		Scanner sc = new Scanner(System.in);
		String c = sc.next().toLowerCase();
		Long count = names.stream().filter(name->name.toLowerCase().startsWith(c)).count();
		System.out.println(count);
	}
	
	
	public void printOutput()
	{
		ArrayList<String> names = new ArrayList<String>();
		names.add("Adam");
		names.add("Billy");
		names.add("Cinthia");
		names.add("Emily");
		names.add("Berlin");
		names.add("Eve");

		names.stream().filter(s->s.length()>3).filter(s->s.contains("i")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	}
	
	@Test
	public void printSort()
	{
		ArrayList<String> names = new ArrayList<String>();
		names.add("Adam");
		names.add("Billy");
		names.add("Cinthia");
		names.add("Emily");
		names.add("Berlin");
		names.add("Eve");
		
		names.stream().sorted().forEach(s->System.out.println(s));
	} */
	
	
	public void countOccurances()
	{
		Scanner str = new Scanner(System.in);
		System.out.print("Enter the sentense : ");
		String sentense = str.nextLine();
		String[] array = sentense.split(" ");
		List<String> newArray = Arrays.asList(array);
		List<Integer> countWords = new ArrayList<Integer>(); 
		List<String> result = new ArrayList<String>();
		List<String> finalResult = new ArrayList<String>();
		System.out.println(newArray.size());
		for(int i=0;i<newArray.size();i++)
		{
			System.out.println(newArray.get(i));
			int count = Collections.frequency(newArray, newArray.get(i));
			result.add(newArray.get(i)+"-"+count);
			if(!(finalResult.contains(result.get(i))))
				finalResult.add(result.get(i));
		
		}
	    System.out.println(finalResult);
		
		
		
	}
	
	@Test
	public void countOccurancesIntegers()
	{
		
		int num;
		Scanner sc = new Scanner(System.in);
		List<String> result = new ArrayList<String>();
		ArrayList<Integer> arrays = new ArrayList<Integer>(Arrays.asList(10,20,30,1,20,1,22));
		List<Integer> numbers = new ArrayList<Integer>();
		for(int i=0;i<10;i++)
		{
			num = sc.nextInt();
			numbers.add(num);
			System.out.println(numbers);
		}
			
		for(int i=0;i<10;i++)
		{
			int count = Collections.frequency(numbers, numbers.get(i));
			int number = numbers.get(i);
			result.add(number+"-"+count);
		} 
		
		List<String> finalResult = result.stream().distinct().collect(Collectors.toList());
		System.out.print(finalResult);
	}
}
