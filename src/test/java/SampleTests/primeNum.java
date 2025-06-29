package SampleTests;

import org.testng.annotations.Test;

public class primeNum {
	
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

}
