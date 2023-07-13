package testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDown_validation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
		Select element= new Select(driver.findElement(By.id("select-demo")));
		
		element.selectByValue("Thursday");
		
		Select multiSelect_element= new Select(driver.findElement(By.id("multi-select")));
		Thread.sleep(2000);
		multiSelect_element.selectByValue("California");
		multiSelect_element.selectByValue("New Jersey");
		multiSelect_element.selectByValue("Ohio");
		
		
		List<WebElement>optionlist= multiSelect_element.getAllSelectedOptions();
		
		for(int i=1; i<optionlist.size(); i++) {
			System.out.println(optionlist.indexOf(i));
		}
		Thread.sleep(2000);
		
		multiSelect_element.deselectByIndex(4);
	}

}
