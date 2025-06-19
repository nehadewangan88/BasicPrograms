package SampleTests;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	/*	WebDriver driver = new ChromeDriver();
		driver.get("https://abc.com");
		driver.findElement(By.id("FN")).sendKeys("Fname");
		driver.findElement(By.id("LN")).sendKeys("Lname");
		driver.findElement(By.id("LoginBtn")).click();
		WebElement item = driver.findElement(By.xpath("xyz"));
		item.click();
		String itemName = item.getText();
		Set<String> allWindows = driver.getWindowHandles();
		Iterator<String> itr = allWindows.iterator();
		String Window1 = itr.next();
		String Window2 = itr.next();
		
		driver.switchTo().window(Window2); */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String str1 = sc.next();
		String rev = "";
		for(int i=str1.length()-1;i>=0;i--)
		{
			
			rev = rev+str1.charAt(i);
			System.out.println(rev);
		}
		System.out.println(rev);
		if(str1.equals(rev))
			System.out.println("Palindrome!!");
		else
			System.out.println("Not Palindrome!!!");
			
	}

}
