package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC002_Selenium {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/xhtml/search");
		
		WebElement search=driver.findElement(By.id("APjFqb"));
		search.sendKeys("Automation Testing tools");
		Thread.sleep(3000);
		search.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		//search.submit();
		//driver.findElement(by.name("btnk")).click();
		System.out.println("Title:"+driver.getTitle());
		//driver.quit();
	}

}
