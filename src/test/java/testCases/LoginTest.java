package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	
	
	public static WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		
		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void doLogin() {
		
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("tandonapurva@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("darkspectre");
	}
	
	@AfterTest
	public void tearDown() {
		
		driver.quit();
	}

}
