package LearningLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnCssSelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//step 1 :open the browser
		WebDriver driver=new ChromeDriver();
		
		//step 2 : naviagte to the link via url
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		//step 3: enter username by using css selector locator and static method
		WebElement usernamebutton=driver.findElement(By.cssSelector("input[type='text']"));
		usernamebutton.sendKeys("standard_user");
		
		//step 4: enter password by using css selector locator and static method
		WebElement passwordbutton=driver.findElement(By.cssSelector("input[type='password']"));
		passwordbutton.sendKeys("secret_sauce");
		
		//step 5: click on the loginbutton by using locator and static method
		WebElement loginbutton=driver.findElement(By.cssSelector("input[type='submit']"));
		loginbutton.submit();
		
		System.out.println("log in succesfull using css selector(tag name and attributes) is done succesfully");
		//step 6: close the browser
		driver.close();

	}

}
