package selenium_programs.seleniumAssignments;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import selenium_programs.BrowserOperations;

public class Day2Task2 extends BrowserOperations {

	public static void main(String[] args) throws InterruptedException {
		selectBrowser("chrome");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://www.Google.com/");
		WebElement search=driver.findElement(By.id("APjFqb"));
		String textEnter="Selenium";
		search.sendKeys(textEnter);
		
		String textShown=search.getAttribute("value");
		if(textEnter.equalsIgnoreCase(textShown)) {
			System.out.println("Text entered correctly:"+textShown);
		}else {
			System.out.println("Text entry verification failed.");
		}
		
		//verify input field is displayed and enabled 
		if(search.isDisplayed() && search.isEnabled()) {
			System.out.println("The search field is displayed and Enabled.");
		}else {
			System.out.println("The search field is not displayed or not enabled.");
		}
		
		Thread.sleep(2000);
		search.clear();
		
		closeBrowser();
	}

}
