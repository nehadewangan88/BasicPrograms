package SampleTests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestArrayProg {

	ArrayList<Integer> array = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
	
	@Test(priority=4)
	public void sumOfAll()
	{
		Optional<Integer> sum = array.stream().reduce((a,b)->a+b);
		System.out.println("Sum is:"+sum.get());
	}
	

	@Test(priority=3)
	public void MultiplyAll()
	{
		Optional<Integer> multiplication = array.stream().reduce((a,b)->a*b);
		System.out.println("Multiplication is:"+multiplication.get());
	}
	
	@Test(groups= {"Regression"})
	public void findAverage()
	{
		double average = array.stream().mapToDouble(Integer::doubleValue).average().orElse(0.0);
		System.out.println("Average is:"+average);
	}
	
	@Test(priority=2)
	public void findMax()
	{
		Optional<Integer> maxNum = array.stream().max(Comparator.naturalOrder());
		System.out.println("Max number is :"+maxNum.get());
	}
	
	@Test(priority=1)
	public void findMin()
	{
		Optional<Integer> minNum = array.stream().min(Comparator.naturalOrder());
		System.out.println("Min number is :"+minNum.get());
	}
	
	@Test(groups= {"Regression"})
	public void sortedArray()
	{
		ArrayList<Integer> numArray = new ArrayList<Integer>(Arrays.asList(902,32,3451,32,11,34,56,22,12,0,9,8,4,3,1));
		Object[] sortedArray = numArray.stream().sorted(Comparator.naturalOrder()).toArray();
		System.out.println(Arrays.toString(sortedArray));
	}
	
	
	@Test(groups= {"Regression"})
	@Parameters({"URL"})
	public void sortReverse(String urlName)
	{
		ArrayList<Integer> orgArray = new ArrayList<Integer>(Arrays.asList(23,45,32,18,95,43,41,54,1,0,3,4,1,3,2));
		Object[] reverseArray = orgArray.stream().sorted(Comparator.reverseOrder()).toArray();
		System.out.println(Arrays.toString(reverseArray));
		System.out.println(urlName);
	}
	
	
	
	
}
