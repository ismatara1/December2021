package variousConcepts;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork {
	WebDriver driver;
	@Before
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\arais\\eclipse-SeleniumDecember20-21\\Class2\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.techfios.com/billing/?ng=admin/");
		driver.manage().window().maximize();
	}
	@Test
	public void loginTest() {
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.xpath("//span[text()='Bank & Cash']")).click();
		driver.findElement(By.xpath("//a[text()='New Account']")).click();
		driver.findElement(By.id("account")).sendKeys("Ara");
		driver.findElement(By.id("description")).sendKeys("Customer");
		driver.findElement(By.id("balance")).sendKeys("3000");
		driver.findElement(By.id("account_number")).sendKeys("0635439");
		driver.findElement(By.id("contact_person")).sendKeys("Arefin");
		driver.findElement(By.id("contact_phone")).sendKeys("6026585536");
	//	driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();		
		}
//	@After
//	public void tearDown() {
//		driver.close();
//	}
}
