package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage {
	WebDriver driver;
	
	By CustomerName=By.xpath("//tr[4]/td[2]/input");
	By Gender=By.xpath("//tr[5]/td[2]/input[1]");
	By DateOfBirth=By.xpath("//*[@id=\"dob\"]");
	
	By Adderess=By.xpath("//tr[7]/td[2]/textarea");
	By City=By.xpath("//tr/td/table/tbody/tr[8]/td[2]/input");
	By State=By.xpath("//tr/td/table/tbody/tr[9]/td[2]/input");
	By Pin=By.xpath("//tr/td/table/tbody/tr[10]/td[2]/input");
	By MobileNumber=By.xpath("//tr/td/table/tbody/tr[11]/td[2]/input");
	By Email=By.xpath("//tr/td/table/tbody/tr[12]/td[2]/input");
	By Password=By.xpath("//tr/td/table/tbody/tr[13]/td[2]/input");
	By Submit=By.xpath("//tr/td/table/tbody/tr[14]/td[2]/input[1]");
	
	
	String URL=("https://www.demo.guru99.com/v4/manager/addcustomerpage.php");
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		
	}
	
	
	public void URL() {
		driver.get(URL);
		
	}
	public void HomePagedetails() {
		driver.findElement(CustomerName).sendKeys("sumana");
		driver.findElement(Gender).click();
		driver.findElement(DateOfBirth).click();
		
		driver.findElement(Adderess).sendKeys("kphb");
		driver.findElement(State).sendKeys("Telangana");
		driver.findElement(Pin).sendKeys("500085");
		driver.findElement(MobileNumber).sendKeys("9876543210");
		driver.findElement(Email).sendKeys("laxmi@gmail.com");
		driver.findElement(Password).sendKeys("123456");
		driver.findElement(Submit).click();
		
	}
	 

}


