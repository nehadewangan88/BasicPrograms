package SampleTests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class TestStrRev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		/*		String str = sc.nextLine();
		String revStr = "";
		for(int i=str.length()-1;i>=0;i--)
		{
			char c = str.charAt(i);
			revStr = revStr+c;
		}
		
		System.out.println(revStr); */
		
		String bigStr = sc.nextLine();
		String[] wordList = bigStr.split(" ");
		List<String> wordsList = Arrays.asList(wordList);
		ArrayList<String> newList = new ArrayList<String>();
		int size=wordsList.size();
		for(int i=0;i<size;i++)
		{
			String element = wordsList.get(i);
			int count = Collections.frequency(wordsList,element);
			String wordCount = element+"-"+count;
			if(!newList.contains(wordCount))
				newList.add(wordCount);
			
		}
		
	//	System.out.println(newList);
		newList.stream().forEach(element->System.out.println(element));
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		ArrayList<String> result = new ArrayList<String>();
		String choice="y";
		Scanner s = new Scanner(System.in);
		
		while(choice.equals("y"))
		{
			System.out.println("Enter number:");
			numbers.add(s.nextInt());
			System.out.println("Enter choice:");
			choice = s.next();
		}
		System.out.println(numbers);
		for(int i=0;i<numbers.size();i++)
		{
			int count = Collections.frequency(numbers, numbers.get(i));
			String element = numbers.get(i)+"-"+count;
			if(!result.contains(element))
				result.add(element);
		}
		System.out.println(result);
			
		
	}		
		
}