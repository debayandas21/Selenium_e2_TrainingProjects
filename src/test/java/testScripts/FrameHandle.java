package testScripts;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FrameHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement label= driver.findElement(By.xpath("//label//span"));
		System.out.println("Label from main page:"+ label.getText());
		driver.switchTo().frame("frame1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Test Data");
		
		//switch to frame 1 to frame 3
		driver.switchTo().frame("frame3");
		Thread.sleep(2000);
		driver.findElement(By.id("a")).click();
		
		//switch to frame 3 to parent frame
		driver.switchTo().parentFrame();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).clear();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Welcome Back");
		
		//switch to main page
		driver.switchTo().defaultContent();
		System.out.println("Page header text:  "+label.getText());
		
		//switch from main page to frame2
		driver.switchTo().frame("frame2");
		Thread.sleep(2000);
		WebElement drpdown= driver.findElement(By.id("animals"));
		Select sl= new Select(drpdown);
		sl.selectByValue("babycat");
		
		Thread.sleep(2000);
		
		
		
		
		driver.quit();

	}

}
