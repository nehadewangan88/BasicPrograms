package SampleTests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;

public class TestLogin {

	WebDriver driver = new ChromeDriver();
	

	@BeforeTest
	public void openURL()
	{
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
	}
	
	@AfterTest
	public void closeApplication()
	{
		driver.close();
	}
	
	
	
	@Test
	public void clickOnAdmin() throws InterruptedException
	{
		driver.findElement(By.xpath("//ul[@class='oxd-main-menu']/li//*[text()='Admin']")).click();
		Thread.sleep(3);
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
