package LearningLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v142.systeminfo.SystemInfo;

public class LearnId {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		//Thread.sleep(3000);
		
		
		WebElement username = driver.findElement(By.name("user-name"));
		username.sendKeys("standard_user");
		//Thread.sleep(3000);
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("secret_sauce");
		//Thread.sleep(3000);
		
		WebElement login=driver.findElement(By.name("login-button"));
		login.submit();
		//Thread.sleep(3000);
		System.out.println("login done sucesfully for Locator_id");
		driver.close();
		
 	}

}
