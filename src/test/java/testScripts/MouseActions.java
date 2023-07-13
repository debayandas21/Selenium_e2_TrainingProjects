package testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MouseActions {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.opencart.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		Actions mouseAction= new Actions(driver);
		
		WebElement option= driver.findElement(By.linkText("Desktops"));
		mouseAction.moveToElement(option).build().perform();
		
		WebElement option1= driver.findElement(By.linkText("Mac (1)"));
		option1.click();
		
		//Scroll down
		
		WebElement priceElement= driver.findElement(By.xpath("//span[@class='price-new']"));
		
		mouseAction.scrollToElement(priceElement);
		Thread.sleep(3000);
		
	}

}
