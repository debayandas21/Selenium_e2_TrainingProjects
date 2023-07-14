package testScripts;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MouseActions {

	/**
	 * @param args
	 * @throws InterruptedException
	 * @throws IOException 
	 */
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		String filePath= System.getProperty("user.dir")+"\\Screenshot";
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.opencart.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		Actions mouseAction= new Actions(driver);
		
		WebElement option= driver.findElement(By.linkText("Desktops"));
		mouseAction.moveToElement(option).build().perform();
		
		TakesScreenshot screen= (TakesScreenshot)driver;
		File scr= screen.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scr, new File("C:\\Users\\Administrator\\git\\Selenium_e2_TrainingProjects\\Screenshot\\src.png"));
		
		WebElement option1= driver.findElement(By.linkText("Mac (1)"));
		option1.click();
		
		//Scroll down
		
		WebElement priceElement= driver.findElement(By.xpath("//span[@class='price-new']"));
		
		mouseAction.scrollToElement(priceElement);
		Thread.sleep(3000);
		
	}

}
