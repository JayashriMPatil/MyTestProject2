import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;

public class QAonAirJunitTest1 {
	WebDriver driver;
	String baseUrl;
	

	@Before
	public void SetUp() throws Exception  { 
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Jayashri\\workspace\\CSDT Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		baseUrl = "http://qaonair.com/register/";   
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@Test
	public void QAOnAirFreelanceNewSignUp() throws Exception { 
		driver.get(baseUrl + "/");
		driver.findElement(By.xpath("//html/body/header/div/div/div[4]/div/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//html/body/div[1]/div/div/div/div/h2")).getText();
		System.out.println("Sign Up Free Account");
		driver.findElement(By.xpath("html/body/div[1]/div/div/div/div/div[1]/div/div[2]/div/a")).click();
		driver.findElement(By.xpath("//html/body/div[1]/div/div/div/div/h2")).getText();
		System.out.println("Sign Up Freelancer Account");
		driver.findElement(By.id("first_name")).sendKeys("Jayu");
		driver.findElement(By.id("last_name")).sendKeys("Patel");
		driver.findElement(By.id("user_email")).sendKeys("jayupatel2@yahoo.com");
		driver.findElement(By.id("user_login")).sendKeys("Jayu");
		driver.findElement(By.id("user_pass")).sendKeys("jayu123");
		driver.findElement(By.id("repeat_pass")).sendKeys("jayu123");	
		driver.findElement(By.cssSelector("button.btn-submit:nth-child(1)")).click();
		System.out.println("User sign up successfully");
		
		
	}
	
	@After
	public void quitdriver() throws Exception {
	
	//driver.quit();
}
	}
