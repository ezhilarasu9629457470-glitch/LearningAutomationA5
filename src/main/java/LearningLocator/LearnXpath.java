package LearningLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		
		WebElement username=driver.findElement(By.xpath("//input[@id='user-name']"));
		
		WebElement password=driver.findElement(By.xpath("//input[contains(@id,'pass')]"));
		

		WebElement logo=driver.findElement(By.xpath("//div[text()='Swag Labs']"));
		
		WebElement login=driver.findElement(By.xpath("//input[@class=\'submit-button btn_action\']"));
		
		WebElement logopartial=driver.findElement(By.xpath("//div[contains(text(),'Swag')]"));
		
		username.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		
		
		String text=logo.getText();
		System.out.println(text);
		
		System.out.println(logopartial.getText());
		
		login.click();
		driver.close();
		
		

	}

}
