package SampleTests;

import org.testng.annotations.Test;

public class TestPracticeTestNg {
	
	int a=10, b=20,c=30;
	
	@Test
	public void addition()
	{
		int result = a+b;
		System.out.println(result);
	}
	@Test
	public void substraction()
	{
		int result = b-a;
		System.out.println(result);
	}
	@Test
	public void multiplication()
	{
		int result = a*b;
		System.out.println(result);
	}
	@Test
	public void division()
	{
		int result = b/a;
		System.out.println(result);
	}
	@Test
	public void modulous()
	{
		int result = c%b;
		System.out.println(result);
	}
}
