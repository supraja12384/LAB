package project;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Q5 {
    WebDriver driver;

    @BeforeClass
    public void setup() {
    
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    	public void handleAlert() {
            driver.get("https://the-internet.herokuapp.com/javascript_alerts");
            driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
            Alert alert = driver.switchTo().alert();
            alert.accept();
            String result = driver.findElement(By.id("result")).getText();
            assert result.equals("You successfully clicked an alert");
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
