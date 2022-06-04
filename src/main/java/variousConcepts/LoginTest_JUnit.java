package variousConcepts;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest_JUnit {

	WebDriver driver;
	
	
	public static void beforeClass() {
	System.out.println("before class");	
	}
	
	public static void aferClass() {
	System.out.println("after class");	
	}


	
	public void launchBrowser() {
		System.out.println("before method");

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


	public void loginTest() {
		System.out.println("test method");

		// identify username element and data insertion
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();
	}

	
	public void negLoginTestPassword() {
System.out.println("negTestMethod");
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123234");
		driver.findElement(By.name("login")).click();
	}

	/*
	 * @Test public void negLoginTestUsername() {
	 * 
	 * driver.findElement(By.id("username")).sendKeys("demo@techfias.com");
	 * driver.findElement(By.id("password")).sendKeys("abc123");
	 * driver.findElement(By.name("login")).click(); }
	 */
	
	public void tearDown() {
		System.out.println("tearDown");
		driver.close();
	}
}
