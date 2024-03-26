package POMTests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pages.LoginPage;

public class LoginTest {
	WebDriver driver;
	LoginPage OBJLoginPage;
	//HomePage ObjHomePage;
	
	@BeforeClass
	void Setup()
	{
	driver=new EdgeDriver();
	OBJLoginPage=new LoginPage(driver);
	OBJLoginPage.URL();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test(priority=1)
	void Login()
	{
		OBJLoginPage.VerifyLogin();
	}
}
