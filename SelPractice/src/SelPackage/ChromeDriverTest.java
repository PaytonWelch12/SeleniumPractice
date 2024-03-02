package SelPackage;

  
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ChromeDriverTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.navigate().to("http://www.google.com/");

		driver.manage().window().maximize();
		 
		 driver.findElement(By.name("q")).sendKeys( "google news");
		 
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Adjust time as necessary
		 wait.until(ExpectedConditions.elementToBeClickable(By.name("btnK"))).click();
		 

	     wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("search")));

	  
	     try {
	         wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Google News"))).click();
	     } catch (Exception e) {
	         System.out.println("Failed to find Google News link in search results.");	          
	     }
		 
		 
	
		// driver.findElement(By.linkText("Google News")).click();
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 
		 try {
		 js.executeScript("scrollBy(0,5000)");
		 }
		 catch (Exception f){
			 System.out.println("Failed to scroll down to look at news.");
		 }
		 driver.quit();  
	}

}