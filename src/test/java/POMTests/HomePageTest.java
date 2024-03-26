package POMTests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pages.HomePage;


public class HomePageTest {
	WebDriver driver;
	
	HomePage ObjHomePage;
	
	@BeforeClass
	void Setup()
	{
	driver=new EdgeDriver();
	ObjHomePage=new HomePage(driver);
	ObjHomePage.URL();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test(priority=1)
	void Home()
	{
		ObjHomePage.HomePagedetails();
	}
}

