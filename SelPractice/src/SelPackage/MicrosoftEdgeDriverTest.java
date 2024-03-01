package SelPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;  

public class MicrosoftEdgeDriverTest {

	public static void main(String[] args) {	  
		
        System.setProperty("webdriver.edge.driver", "D:\\Edge Driver\\msedgedriver.exe");
            
        EdgeOptions options = new EdgeOptions();
    
        WebDriver driver = new EdgeDriver(options);
             
        driver.get("http://www.google.com");
        
        driver.findElement(By.name("q")).sendKeys( "google news");
		 
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); 
		 
		 wait.until(ExpectedConditions.elementToBeClickable(By.name("btnK"))).click();
		 
	     wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("search")));

	     try {
	         wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Google News"))).click();
	     } catch (Exception e) {
	         System.out.println("Failed to find Google News link in search results.");	          
	     }
		 
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
