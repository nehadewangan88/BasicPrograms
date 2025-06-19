package SampleTests;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.protobuf.Value;

public class SwitchToAllWindows {

	@Test
	public void NavigateToAllWindows() throws InterruptedException, URISyntaxException, IOException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		for(WebElement link : allLinks)
		{
			link.click();
		}
		Set<String> allWindows = driver.getWindowHandles();
		Iterator itr = allWindows.iterator();
		ArrayList<String> windowList = new ArrayList<String>();
		while(itr.hasNext())
		{
			String window = itr.next().toString();
			windowList.add(window);
		}
		for(int i=0;i<windowList.size();i++)
		{
			driver.switchTo().window(windowList.get(i));
			String title = driver.getTitle();
			System.out.println(title); 
		}
		driver.switchTo().window(windowList.get(0));
		
	}
	
	
	
	
}

