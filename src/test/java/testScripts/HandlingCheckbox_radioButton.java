package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCheckbox_radioButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement CheckBox= driver.findElement(By.xpath("(//label[@class='checkbox-inline'])[1]//input"));
		
		if(!CheckBox.isSelected()) {
			CheckBox.click();
			System.out.println("Check box after click: "+ CheckBox.isSelected());
		}
		
		
		/*Radio button status check */
		
		driver.navigate().to("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");
		WebElement radioButton1= driver.findElement(By.xpath("(//label[@class='radio-inline'])[1]//input"));
		
		WebElement radioButton2= driver.findElement(By.xpath("(//label[@class='radio-inline'])[4]//input"));
		WebElement radioButton3= driver.findElement(By.xpath("(//label[@class='radio-inline'])[7]//input"));
		
		if(!radioButton1.isSelected()) {
			radioButton1.click();
			System.out.println("radio button after click: "+ radioButton1.isSelected());
			Thread.sleep(1000);
		}
		
		if(!radioButton2.isSelected()) {
			radioButton2.click();
			System.out.println("radio button after click: "+ radioButton2.isSelected());
			Thread.sleep(1000);
		}
		
		if(!radioButton3.isSelected()) {
			radioButton3.click();
			System.out.println("radio button after click: "+ radioButton3.isSelected());
			Thread.sleep(1000);
		}
		
		driver.quit();
	}

	
}
