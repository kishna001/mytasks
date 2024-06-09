
package selenium_programs.seleniumAssignments;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day2Task1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://login.salesforce.com");
		String aTitle=driver.getTitle();
		System.out.println(aTitle);
		String eTitle="login | salesforce";
		if(eTitle.equalsIgnoreCase(aTitle)) {
			System.out.println("Titles are matching-TC PASS");
		}else {
			System.out.println("Titles are not matching-TC Fail");
		}
			
		
			Thread.sleep(1000);
			
			driver.quit();

	}

}

