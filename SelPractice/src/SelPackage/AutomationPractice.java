package SelPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import static org.junit.jupiter.api.Assertions.*;

public class AutomationPractice {
	
	public static void main(String[] args) {

	        System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");

	        ChromeOptions options = new ChromeOptions();
	        options.addArguments("--start-maximized");
	        WebDriver driver = new ChromeDriver(options);

	        driver.navigate().to("https://the-internet.herokuapp.com/");
	        driver.findElement(By.partialLinkText("A/B")).click();
	        
	        
	        String myString = driver.findElement(By.cssSelector("p")).getText();	        
	        
	        driver.quit();
		}
}
