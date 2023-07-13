package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterValue_textBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("https://automationbookstore.dev/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		WebElement srchBar = driver.findElement(By.id("searchBar"));

		WebElement CrossIcon = driver.findElement(By.xpath("//a[@title='Clear text']"));

		srchBar.sendKeys("Test Automation");
		Thread.sleep(2000);

		if (CrossIcon.isDisplayed()) {
			System.out.println("Cross icon is clicked: " + CrossIcon.isDisplayed());
			CrossIcon.click();
		}
		System.out.println("Cross icon is clicked: " + CrossIcon.isDisplayed());
		

		driver.quit();
	}

}
