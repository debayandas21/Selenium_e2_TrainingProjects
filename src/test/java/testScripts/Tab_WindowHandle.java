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
import org.openqa.selenium.support.ui.WebDriverWait;

public class Tab_WindowHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.stqatools.com/demo/Windows.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		String parent = driver.getWindowHandle();
		System.out.println("Parent window......." + parent);

		driver.findElement(By.xpath("//button[text()=' Click to open new Tab ']")).click();
		Thread.sleep(2000);

		Set<String> tabs = driver.getWindowHandles();
		System.out.println("Tabs count:  " + tabs.size());

		WebDriverWait waitdrver = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		
		for (String child : tabs) {
			if (!child.equals(parent)) {
				driver.switchTo().window(child);
				System.out.println("Child window......." + child);
				Thread.sleep(5000);
				
				WebElement element = driver
						.findElement(By.xpath("(//span[@class='menu-item-text']//span[text()='Java'])[1]"));
				waitdrver.until(ExpectedConditions.visibilityOf(element));
				element.click();

			}
		}

		driver.close();
		driver.switchTo().window(parent);
		System.out.println("Parent window......." + parent);
		driver.findElement(By.xpath("//button[text()=' Click to open new Window ']"));
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.navigate().to("https://www.selenium.dev");
		Thread.sleep(5000);
		driver.quit();

	}

}
