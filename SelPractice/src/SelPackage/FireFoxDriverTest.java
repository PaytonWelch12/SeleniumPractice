package SelPackage;


	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.firefox.FirefoxOptions;
	 
	  
	public class FireFoxDriverTest {  
	  
	    public static void main(String[] args) {  
	          
	   
	    System.setProperty("webdriver.gecko.driver","D:\\GeckoDriver\\geckodriver.exe" );  
	          
	    FirefoxOptions options = new FirefoxOptions();
	    options.setBinary("C:/Program Files/Mozilla Firefox/firefox.exe");
	 
	    WebDriver driver = new FirefoxDriver(options);
	          
	    driver.navigate().to("https://paytonwelch12.github.io/WebsitePW/");  
	     
	    WebElement element = driver.findElement(By.id("portfolio"));
	     
	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	     
	    driver.quit();  
	      
	    }  
	  
	}  
