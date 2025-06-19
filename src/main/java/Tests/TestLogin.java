package Tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;

import java.time.Duration;

import org.openqa.selenium.By;

public class TestLogin {

	WebDriver driver = new ChromeDriver();
	

//	@BeforeAll
	public void openURL()
	{
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	
	public void loginToApp(String userName, String password)
	{
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(userName);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
	}
	
	//@AfterAll
	public void closeApplication()
	{
		driver.close();
	}
	
	
	
//	@Test
	public void clickOnAdmin(String text ) throws InterruptedException
	{
		driver.findElement(By.xpath("//ul[@class='oxd-main-menu']/li//*[text()='"+text+"']")).click();
		Thread.sleep(5);
	}
	
	public void getURL()
	{
		String url = driver.getCurrentUrl();
		System.out.println(url);
	}
	
	@Test
	public void clickOnPIM() throws InterruptedException
	{
		driver.findElement(By.xpath("//ul[@class='oxd-main-menu']/li//*[text()='PIM']")).click();
		Thread.sleep(3);
	}
	
	@Test
	public void clickOnLeave() throws InterruptedException
	{
		driver.findElement(By.xpath("//ul[@class='oxd-main-menu']/li//*[text()='Leave']")).click();
		Thread.sleep(3);
	}
	
	@Test
	public void clickOnTime() throws InterruptedException
	{
		driver.findElement(By.xpath("//ul[@class='oxd-main-menu']/li//*[text()='Time']")).click();
		Thread.sleep(3);
	}
	
	@Test
	public void clickOnRecruitment() throws InterruptedException
	{
		driver.findElement(By.xpath("//ul[@class='oxd-main-menu']/li//*[text()='Recruitment']")).click();
		Thread.sleep(3);
	}
	
	@Test
	public void clickOnMyInfo() throws InterruptedException
	{
		driver.findElement(By.xpath("//ul[@class='oxd-main-menu']/li//*[text()='My Info']")).click();
		Thread.sleep(3);
	}
}
