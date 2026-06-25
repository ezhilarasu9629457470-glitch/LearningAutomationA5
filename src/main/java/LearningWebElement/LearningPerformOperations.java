package LearningWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningPerformOperations {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		WebElement username=driver.findElement(By.xpath("//input[@id='user-name']"));
		username.sendKeys("standard_user");
		System.out.println("username entered sucesfully");
		username.clear();
		System.out.println("username cleared sucesfully");
		username.sendKeys("standard_user");
		System.out.println("username re-entered  sucesfully");
		
		WebElement password=driver.findElement(By.xpath("//input[contains(@id,'pass')]"));
		password.sendKeys("secret_sauce");
		System.out.println("password entered  sucesfully");
		
		WebElement loginbtn=driver.findElement(By.xpath("//div[contains(text(),'Swag')]"));
		loginbtn.submit();
		System.out.println("login done using click method is done succesfully");
		
		driver.close();
		
		
		

	}

}
