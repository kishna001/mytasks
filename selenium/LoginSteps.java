package selenium_programs.seleniumAssignments.Day5Task2andDay6Task1;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	WebDriver driver;
	
    @Given("the user is on the login page")
    public void theUserIsOnTheLoginPage() {
   	 driver=new EdgeDriver();
   	 driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  	 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");	
    }
    
    @When("the user enters valid credentials")
    public void theUserEntersValidCredentials() throws InterruptedException{
   	 WebElement uname=driver.findElement(By.name("username"));
   	 uname.sendKeys("Admin");
   	 WebElement pwd=driver.findElement(By.name("password"));
   	 pwd.sendKeys("admin123"); 
   	 WebElement logbtn=driver.findElement(By.xpath("//button[@type='submit']"));
   	 Thread.sleep(2000);
   	 logbtn.click();
    }
    @Then("the user is redirected to the homepage")
    public void theUserIsRedirectedToTheHomepage() throws InterruptedException{
   	    String expect="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
   	    String actual=driver.getCurrentUrl();
   	    Assert.assertEquals(actual, expect);
   	    Thread.sleep(2000);
   	    driver.quit();    
    }
    @When("the user enters invalid credentials")
    public void theUserEntersInvalidCredentials() throws InterruptedException {
    	WebElement uname=driver.findElement(By.name("username"));
      	 uname.sendKeys("Admin123");
      	 WebElement pwd=driver.findElement(By.name("password"));
      	 pwd.sendKeys("admin"); 
      	 WebElement logbtn=driver.findElement(By.xpath("//button[@type='submit']"));
      	 Thread.sleep(2000);
      	 logbtn.click();
    }
    @Then("an error message is displayed")
    public void anErrorMessageIsDisplayed() {
    	WebElement error=driver.findElement(By.cssSelector("div[role='alert']"));
    	Assert.assertTrue(error.isDisplayed());
    	driver.quit();
    }
    
}
