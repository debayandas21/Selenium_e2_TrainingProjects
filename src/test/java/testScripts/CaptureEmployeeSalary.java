package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureEmployeeSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	WebDriver driver= new ChromeDriver();
		
		driver.get("https://demo.seleniumeasy.com/table-sort-search-demo.html");
		driver.manage().window().maximize();
		
		WebElement Salary= driver.findElement(By.xpath("//td[contains(text(),'B. Wagner')]//following-sibling::td[5]"));
		
		String EmployeeSalary= Salary.getText();
		System.out.println("B.Wagner Salary is: "+EmployeeSalary);
		
		driver.quit();
	}

	
	
}
