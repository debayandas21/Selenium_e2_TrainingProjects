package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDom {

	
	// Shadow dom related scenario

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("http://watir.com/examples/shadow_dom.html");
		driver.manage().window().maximize();

		WebElement ShadowHost = driver.findElement(By.id("shadow_host"));
		SearchContext context = ShadowHost.getShadowRoot();

		WebElement ShadowContext = context.findElement(By.cssSelector("#shadow_content"));
		System.out.println("Text from shadow content " + ShadowContext.getText());

	}

}
