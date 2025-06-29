package SampleTests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgSampleTests {

	@Test(priority=1)
	public void priority1()
	{
		System.out.println("Priority 1 Test Case");
	}
	
	@Test(priority=2)
	public void priority2()
	{
		System.out.println("Priority 2 Test Case");
	}
	
	@Test(priority=3)
	public void priority3()
	{
		System.out.println("Priority 3 Test Case");
	}
	
	
	@Test(priority=4)
	public void priority4()
	{
		System.out.println("Priority 4 Test Case");
	}
	
	
	@Test(priority=5)
	public void priority5()
	{
		System.out.println("Priority 5 Test Case");
	}
	
	@Test
	public void sortArray()
	{
		Integer[] arrayList = {23,55,43,21,33,445,33,23,43,2123,0,1,9};
		Arrays.sort(arrayList,Collections.reverseOrder());
		System.out.println(Arrays.asList(arrayList));
	}
	
	@Test
	public void StringSorting()
	{
		String[] strArray = {"Hello","Hi","How","Are","You"};
		Arrays.sort(strArray,Collections.reverseOrder());
		System.out.println(Arrays.asList(strArray));
	}
	
	
	@BeforeMethod
	public void ExecuteBeforeAll()
	{
		System.out.println("ExecuteBeforeAllMethods");
	}
	
	@BeforeClass
	public void ExecuteClass()
	{
		System.out.println("ExecuteBeforeClass");
	}
	
	@BeforeSuite
	public void ExecuteSuite()
	{
		System.out.println("ExecuteBeforeSuite");
	}
	
	@BeforeTest
	public void ExecuteTest()
	{
		System.out.println("ExecuteBeforeTest");
	}
}
