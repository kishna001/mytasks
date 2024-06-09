package selenium_programs.seleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import selenium_programs.BrowserOperations;

public class Day3Task1 extends BrowserOperations {

	public static void main(String[] args) throws InterruptedException {
		selectBrowser("chrome");
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        
		//Extract data from specific cell of table
		WebElement table=driver.findElement(By.cssSelector(".tableFixHead"));
		WebElement cell=table.findElement(By.xpath(".//tr[4]/td[3]"));
		String cellText=cell.getText();
		System.out.println("Extracted text from table cell: "+cellText);
		
		//Locate and interact with a checkbox
		WebElement checkbox=driver.findElement(By.id("checkBoxOption2"));
		if(!checkbox.isSelected()) {
			checkbox.click();
			Thread.sleep(2000);
		}
		System.out.println("Checkbox is selected: "+ checkbox.isSelected());
		
		//Locate and interact with a radio button
		WebElement radioButton=driver.findElement(By.xpath("//input[@value='radio2']"));
		if(!radioButton.isSelected()) {
			radioButton.click();
			Thread.sleep(2000);
		}
		System.out.println("Radio button is selected: "+radioButton.isSelected());
		Thread.sleep(2000);
		driver.close();
	}
	

}
