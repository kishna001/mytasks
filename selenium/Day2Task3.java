package selenium_programs.seleniumAssignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import selenium_programs.BrowserOperations;

public class Day2Task3 extends BrowserOperations{

	public static void main(String[] args) throws InterruptedException{
		
		selectBrowser("chrome");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://login.salesforce.com/");
		
		//Locate the element using CSS selector
		WebElement elementByCss=driver.findElement(By.cssSelector("#Login"));
		if(elementByCss!=null) {
			System.out.println("Element found using CSS Selector.");
		}else {
			System.out.println("Element not found using CSS Selector.");
		}
		
		//Locate the element using Xpath
		WebElement elementByXpath=driver.findElement(By.xpath("//input[@id='Login']"));
		if(elementByXpath!=null) {
			System.out.println("Element found using Xpath.");
		}else {
			System.out.println("Element not found using Xpath.");
		}
		
		Thread.sleep(2000);
		closeBrowser();

	}

}
