package testScripts;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AlertHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.seleniumeasy.com/javascript-alert-box-demo.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement button= driver.findElement(By.xpath("//button[@class='btn btn-default']"));
		
		WebElement button1= driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
		WebElement button2= driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
		
		
		/*Capture the alert popup text*/
		
		button.click();
		Thread.sleep(2000);
		Alert alert= driver.switchTo().alert();
		System.out.println("Alert popup Text: "+ alert.getText());
		alert.accept();   // To click on OK optin in alert popup
		
		
		//Cancel the popup
		button1.click();
		Thread.sleep(2000);
		alert.dismiss();
		
		//Cancel the popup
		button2.click();
		Thread.sleep(2000);
		alert.sendKeys("Selenium Popup");
		Thread.sleep(2000);
		alert.accept();
		
		WebElement element= driver.findElement(By.id("prompt-demo"));
		if(element.isDisplayed()) {
			String text= element.getText().trim();
			
			if(text.equals("You have entered 'Selenium Popup' !")) {
			System.out.println("Test matched with popup");
		}
		}
		
		driver.quit();
		
	}

}
