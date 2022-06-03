package variousConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	static WebDriver driver;

	public static void main(String[] args) {
		launchBrowser();
		loginTest();
		tearDown();
		
		launchBrowser();
		negLoginTest();
		tearDown();
	}

	public static void launchBrowser() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\arais\\eclipse-SeleniumDecember20-21\\Class2\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		// delete cookies
		driver.manage().deleteAllCookies();
		// go to the site
		driver.get("http://www.techfios.com/billing/?ng=admin/");
		// maximize window
		driver.manage().window().maximize();
	}

	public static void loginTest() {

		// identify username element and data insertion
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();
	}

	public static void negLoginTest() {

		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123234");
		driver.findElement(By.name("login")).click();
	}

	public static void tearDown() {
		driver.close();
	}
}
