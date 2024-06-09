package selenium_programs.seleniumAssignments;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Day3Task2 {

	public static void main(String[] args)  {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		try {
				//Navigate to webpage
				driver.get("https://rahulshettyacademy.com/AutomationPractice/");
				
				//Explicit wait to wait for the button to become clickable
				WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
				WebElement button=wait.until(ExpectedConditions.elementToBeClickable(By.id("alertbtn")));
				button.click();
				
				
				//Explicit wait to ensure the alert is present
				wait.until(ExpectedConditions.alertIsPresent());
				
				//Switch to the alert and accept it
				Alert alert=driver.switchTo().alert();
				Thread.sleep(2000);
			    alert.accept();
			    
			    
			    System.out.println("Alert was accepted successfully");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
		      driver.quit();
     	}
	}

}
