package pac2;


import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class lab8_4 {
	WebDriver driver;
  @Test()
  public void f() throws InterruptedException {
	  //title verification
	  Assert.assertEquals(driver.getTitle(),"Your Store");
	  if(driver.getTitle().equals("Your Store"))
		{
	System.out.println("titele is matched");
	Assert.assertTrue(true);
		}
else
{
	System.out.println("titele is nt matched");
	Assert.assertFalse(true);
	
		}
	/*
Go to 'Desktops' tab
Click on 'Mac'
Select 'Name(A-Z)' from the 'Sort By' dropdown
Click on 'Add to Cart' button
*/
	  driver.findElement(By.linkText("Desktops")).click();
		 driver.findElement(By.linkText("Mac (1)")).click();

		 WebElement sort=driver.findElement(By.id("input-sort"));
			Select sle=new Select(sort);
			sle.selectByVisibleText("Name (A - Z)");
			driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/div/div[2]/div[2]/button[1]")).click();
			//Enter ‘Mobile’ in ‘Search’ text box and click on ‘Search’ button
			driver.findElement(By.name("search")).sendKeys("Mobile");
			driver.findElement(By.xpath("//*[@id=\"search\"]/span/button")).click();
			Thread.sleep(2000);
			//Clear the text from ‘Search Criteria’ text box
			//Click on ‘Search in product descriptions’ check box and click on ‘Search’ button
			driver.findElement(By.id("input-search")).clear();
			driver.findElement(By.name("description")).click();
			driver.findElement(By.id("button-search")).click();
			
			
  }
  @BeforeMethod
  public void beforeMethod() {
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.get("https://tutorialsninja.com/demo/index.php");
  }

  @AfterMethod
  public void afterMethod() {
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before Class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before Test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After Test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Before Suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("After Suite");
  }


}