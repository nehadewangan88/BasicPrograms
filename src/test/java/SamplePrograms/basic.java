package SamplePrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.testng.annotations.Test;

public class basic {

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
		if(count==0)
		{
			System.out.println(i+" is prime!!!");
		}
	}
}
	
	
	
}
