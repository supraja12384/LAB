package pac2;

	import java.io.FileInputStream;
	import java.io.IOException;
	import java.time.Duration;
	import java.util.Properties;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class lab12 {

	    public static void main(String[] args) throws IOException, InterruptedException {

	        // Load properties file
	        Properties prop = new Properties();
	        FileInputStream fis = new FileInputStream("C:\\Users\\supraja\\eclipse-workspace\\Selenium_project\\login.properties");
	        prop.load(fis);

	        // Launch browser
	        WebDriverManager.chromedriver().setup();
	        WebDriver driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	        // Explicit wait
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	        // Open URL
	        driver.get(prop.getProperty("url"));

	        // Verify Title
	        String title = driver.getTitle();
	        System.out.println("Title is: " + title);

	        // Actions using properties
	        wait.until(ExpectedConditions.elementToBeClickable(getBy(prop.getProperty("myAccount")))).click();
	        wait.until(ExpectedConditions.elementToBeClickable(getBy(prop.getProperty("register")))).click();

	        driver.findElement(getBy(prop.getProperty("firstname"))).sendKeys("John");
	        driver.findElement(getBy(prop.getProperty("lastname"))).sendKeys("Doe");
	        driver.findElement(getBy(prop.getProperty("email"))).sendKeys("john.doe" + System.currentTimeMillis() + "@gmail.com");
	        driver.findElement(getBy(prop.getProperty("telephone"))).sendKeys("9876543210");
	        driver.findElement(getBy(prop.getProperty("password"))).sendKeys("Password@123");
	        driver.findElement(getBy(prop.getProperty("confirmPassword"))).sendKeys("Password@123");

	        driver.findElement(getBy(prop.getProperty("privacyPolicy"))).click();
	        driver.findElement(getBy(prop.getProperty("continueBtn"))).click();

	        // Verify Success Message
	        WebElement successElement = wait.until(ExpectedConditions.visibilityOfElementLocated(getBy(prop.getProperty("successMsg"))));
	        String successMsg = successElement.getText();

	        if (successMsg.equals("Your Account Has Been Created!")) {
	            System.out.println("✅ Test Passed: Account Created Successfully");
	        } else {
	            System.out.println("❌ Test Failed: Account creation message mismatch");
	        }

	        driver.quit();
	    }

	    // Helper method to resolve locators
	    private static By getBy(String locator) {
	        if (locator == null) {
	            throw new IllegalArgumentException("Locator is null! Please check your properties file.");
	        }
	        if (locator.startsWith("//") || locator.startsWith("(//")) {
	            return By.xpath(locator);
	        } else if (locator.startsWith("id=")) {
	            return By.id(locator.replace("id=", ""));
	        } else if (locator.startsWith("name=")) {
	            return By.name(locator.replace("name=", ""));
	        }
	        return By.cssSelector(locator); // default
	    }
	}


