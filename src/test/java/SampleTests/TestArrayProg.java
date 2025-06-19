package SampleTests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class TestArrayProg {

	ArrayList<Integer> array = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
	
	@Test(priority=4)
	public void sumOfAll()
	{
		Optional<Integer> sum = array.stream().reduce((a,b)->a+b);
		System.out.println(sum);
	}
	

	@Test(priority=3)
	public void MultiplyAll()
	{
		Optional<Integer> multiplication = array.stream().reduce((a,b)->a*b);
		System.out.println(multiplication);
	}
	
	@Test(priority=2)
	public void findMax()
	{
		String maxNum = array.stream().max(Comparator.naturalOrder()).toString();
		System.out.println(maxNum);
	}
	
	@Test(priority=1)
	public void findMin()
	{
		Optional<Integer> minNum = array.stream().min(Comparator.naturalOrder());
		System.out.println(minNum);
	}
	
	
}
