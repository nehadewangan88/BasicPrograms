package SampleTests;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NestedFrames {
	
	@Test
	public void nestedFrameOperations() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		WebElement innerFrameSet = driver.findElement(By.xpath("//frameset/frameset"));
		List<WebElement> frameElements = innerFrameSet.findElements(By.tagName("frame"));
		System.out.println(frameElements.size());
		driver.switchTo().frame(frameElements.get(1));
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//span[text()='Hi, I am the UI.Vision IDE']/../../../div/div[@id='i6']")).click();
		Thread.sleep(10);
		driver.switchTo().parentFrame();
		String parentFrameText = driver.findElement(By.tagName("p")).getText();
		System.out.println(parentFrameText);
		
	}

}
