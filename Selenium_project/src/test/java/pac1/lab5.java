package pac1;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class lab5 {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.automationpractice.pl/index.php?");
	String Title = driver.getTitle();
    System.out.println("Page Title: " + Title);
    if (Title.equals("My Shop")) {
        System.out.println("Title verified");
    } else {
        System.out.println("Title verification failed");
    }

driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
if(driver.findElement(By.id("email_create")).isDisplayed()){
	System.out.println("Email create is displayed");
	driver.findElement(By.id("email_create")).clear();
	driver.findElement(By.id("email_create")).sendKeys("supraja@gmail.com");
	driver.findElement(By.id("email_create")).sendKeys(Keys.TAB);
	driver.findElement(By.id("email_create")).sendKeys(Keys.ENTER);
}
else {
	System.out.println("Email create is not displayed");
}
WebElement Heading = driver.findElement(By.className("page-heading"));
if(Heading.isDisplayed()) {
	System.out.println(" heading is displayed ");
		
	}else {
		System.out.println(" heading is not found");
}

Thread.sleep(3000);
driver.findElement(By.id("id_gender1")).click();
if(	driver.findElement(By.id("id_gender1")).isSelected())
{
	System.out.println("gender1 is selected");
}
else
{
	System.out.println("gender1 is not selected");
}

//first name

if (driver.findElement(By.id("customer_firstname")).isDisplayed()) {
    System.out.println("firstname field is displayed");
    driver.findElement(By.id("customer_firstname")).sendKeys("suppu");
} else {
    System.out.println("firstname field is not displayed");
}

driver.findElement(By.id("submitAccount")).click();

WebElement err = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/ol/li[2]"));
System.out.println("Error displayed: " + err.getText());

if (err.getText().equals("firstname is too long. Maximum length: 32")) {
    System.err.println("Error message is verified");
} else {
    System.out.println("Error message is not verified");
}


//Last Name

if(driver.findElement(By.id("customer_lastname")).isDisplayed()) {
	System.out.println("lastname field is displayed");
driver.findElement(By.id("customer_lastname")).sendKeys("ndkfskkkkkk");
}
driver.findElement(By.id("submitAccount")).click();
WebElement err1 = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/ol/li[1]"));
System.out.println("Error displayed: " + err1.getText());

if (err1.getText().equals("lastname is too long. Maximum length: 32")) {
    System.err.println("Error message is verified");
} else {
    System.out.println("Error message is not verified");
}

//password

if (driver.findElement(By.id("passwd")).isDisplayed()) {
    System.out.println("Password field is displayed");

    String password = "sj7hugb"; 
   
        driver.findElement(By.id("passwd")).sendKeys(password);
        
        //
        
      
}
//Date of birth

WebElement sort=driver.findElement(By.id("days"));
Select sle=new Select(sort);
Thread.sleep(3000);
sle.selectByValue("1");

WebElement sort1=driver.findElement(By.id("months"));
Select sle1=new Select(sort1);
Thread.sleep(3000);
sle1.selectByVisibleText("march ");
WebElement sort2=driver.findElement(By.id("years"));
Select sle2=new Select(sort2);
Thread.sleep(3000);
sle2.selectByVisibleText("2002  ");
driver.findElement(By.id("newsletter")).click();

driver.findElement(By.id("submitAccount")).click();
}
}




