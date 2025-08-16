package pac1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC008_Selenium {
	public static void main(String[] args) {
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://letcode.in/alert");
	
	driver.findElement(By.id("accept")).click();
	Alert salert =driver.switchTo().alert();
	System.out.println("The message is:"+salert.getText());
	salert.accept();
	
	driver.findElement(By.id("confirm")).click();
	Alert calert=driver.switchTo().alert();
	System.out.println("confirm alert:"+calert.getText());
	calert.dismiss();
	
	driver.findElement(By.id("prompt")).click();
	Alert palert=driver.switchTo().alert();
	System.out.println("prompt alert:"+palert.getText());
	palert.sendKeys("Hii");
	palert.accept();


}
}
