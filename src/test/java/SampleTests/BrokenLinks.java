package SampleTests;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {



		WebDriver driver = new ChromeDriver();
		public static void main(String[] args) throws IOException {
			
			WebDriver driver = new ChromeDriver();


			// Navigate to BStackDemo Website
			driver.get("https://bstackdemo.com/");


			// Finding all the available links on webpage
			List<WebElement> links = driver.findElements(By.tagName("a"));


			// Iterating each link and checking the response status
			for (WebElement link : links) {
			String url = link.getAttribute("href");
			
			URL urlLink = new URL(url);
			HttpURLConnection httpURLConnection = (HttpURLConnection) urlLink.openConnection();
			httpURLConnection.setConnectTimeout(3000); // Set connection timeout to 3 seconds
			httpURLConnection.connect();


			if (httpURLConnection.getResponseCode() == 200) {
			System.out.println(urlLink + " - " + httpURLConnection.getResponseMessage());
			} else {
			System.out.println(urlLink + " - " + httpURLConnection.getResponseMessage() + " - " + "is a broken link");
			}
	}

		}
}