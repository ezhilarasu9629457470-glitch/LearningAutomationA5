package LearningLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnLinktext_partialLinkText {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		//Thread.sleep(2000);
		WebElement logo=driver.findElement(By.linkText("Swag Labs"));
		
		String logoname=logo.getText();
		System.out.println(logoname);
		System.out.println("linkText and partial linktext executed successfully");
		
		driver.close();
		
	}
}
