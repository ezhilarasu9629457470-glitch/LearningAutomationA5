package LearningLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		//Thread.sleep(3000);
		
		
		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user");
		//Thread.sleep(3000);
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		//Thread.sleep(3000);
		
		WebElement login=driver.findElement(By.id("login-button"));
		login.submit();
		//Thread.sleep(3000);
		System.out.println("login done sucesfully for locator_name");
		driver.close();

	}

}
