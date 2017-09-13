import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;

public class QaonAirJunitTest4 {
	WebDriver driver;
	String baseUrl;
	

	@Before
	public void SetUp() throws Exception  { 
	System.setProperty("webdriver.gecko.driver","C:\\Users\\Jayashri\\workspace\\CSDT Drivers\\geckodriver.exe");
	driver = new FirefoxDriver();
	baseUrl = "http://qaonair.com/register/"; 
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	}
	
	@Test
	public void QAonAirRegSignUp() throws Exception {
		String FName ="Jayu";
		String LName="Patel";
		String Email="jayupatel2@yahoo.com";
		String UName="Jayu";
	    String UPswd="jayu123";
	    String UPswd2="jayu123";
	    
	driver.get(baseUrl + "/");
	driver.findElement(By.xpath("//html/body/header/div/div/div[4]/div/ul/li[2]/a")).click();
	driver.findElement(By.xpath("//html/body/div[1]/div/div/div/div/h2")).getText();
	System.out.println("Sign Up Free Account");
	driver.findElement(By.xpath("html/body/div[1]/div/div/div/div/div[1]/div/div[2]/div/a")).click();
	driver.findElement(By.xpath("//html/body/div[1]/div/div/div/div/h2")).getText();
	System.out.println("Sign Up Freelancer Account");
	driver.findElement(By.id("first_name")).sendKeys(FName);
	driver.findElement(By.id("last_name")).sendKeys(LName);
	driver.findElement(By.id("user_email")).sendKeys(Email);
	driver.findElement(By.id("user_login")).sendKeys(UName);
	driver.findElement(By.id("user_pass")).sendKeys(UPswd);
	driver.findElement(By.id("repeat_pass")).sendKeys(UPswd2);	
	driver.findElement(By.cssSelector("button.btn-submit:nth-child(1)")).click();
	
		
} 
	
@After
public void VerifyText() {
	    String ExpText,ActText;
		ExpText = "Sorry, that username already exists!";
		ActText= driver.findElement(By.xpath("//html/body/div[1]/div/div/div/div/form/ul/li")).getText();
	   	System.out.println("Exp Text: " + ExpText);
		System.out.println("ActText: " + ActText);
		if(ExpText.equals(ActText)) {
			System.out.println("Test Pass");
			
		} else {
			
			System.out.println("Test Fail");
			
//driver.quit();
}	
}
}
