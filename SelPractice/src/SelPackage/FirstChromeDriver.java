package SelPackage;


	import java.time.Duration;

	import org.openqa.selenium.By;  
	import org.openqa.selenium.WebDriver;  
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;  


public class FirstChromeDriver {
	
		

		public static void main(String[] args) {
			
		    // declaration and instantiation of objects/variables  
		    System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");  
		    WebDriver driver=new ChromeDriver();  
		      
		    // Launch web
		    driver.navigate().to("http://www.google.com/");  
		          
		    // Click on the search text box and send value  
		    driver.findElement(By.name("q")).sendKeys("sample search");  
		    
		          
		    // Click on the search button  
		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Adjust time as necessary
		    wait.until(ExpectedConditions.elementToBeClickable(By.name("btnK"))).click();
		 
		       
		    driver.quit();  
		}

	}