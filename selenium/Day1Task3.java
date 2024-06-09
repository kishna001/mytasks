package selenium_programs.seleniumAssignments;

import org.openqa.selenium.chrome.ChromeDriver;

public class Day1Task3 {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.navigate().to("https://www.selenium.dev/");
        driver.quit();
	}

}
