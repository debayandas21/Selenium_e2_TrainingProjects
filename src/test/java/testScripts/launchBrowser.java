package testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://google.com");
		driver.manage().window().maximize();
		
		//Search Java tutorial

		WebElement searchBox= driver.findElement(By.name("q"));
		
		searchBox.sendKeys("Java Tutorials");
		
		Thread.sleep(3000);
		
		List<WebElement> list= driver.findElements(By.xpath("(//ul[@role='listbox'])[1]//li//descendant"
				+ "::div[@class='pcTkSc']"));
		
		System.out.println("Number of items: "+ list.size());
		
		for(int i= 1; i< list.size(); i++) {
			WebElement items= driver.findElement(By.xpath("((//ul[@role='listbox'])[1]//li//descendant::div[@class='pcTkSc'])["+i+"]"));
			String eleMentName= items.getText();
			if(eleMentName.equals("Java Tutorials'"));
			System.out.println("Element name matched");
			items.click();	
			break;
			
			
		}
		
		
		driver.quit();
		
	}

}
