package handlingMouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearningMouseActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20l));
		
		driver.get("https://demowebshop.tricentis.com/");
		
		Actions actionsobj=new Actions(driver);
		//using moveToElement(webelement)
		actionsobj.moveToElement(driver.findElement(By.xpath("//ul[@class='top-menu']//a[@href='/computers']"))).perform();
		//using click(webelement) with argument
		actionsobj.click(driver.findElement(By.xpath("//ul[@class='top-menu']//a[@href='/notebooks']"))).perform();
		//using doubleclick(webelement)
		
		actionsobj.doubleClick(driver.findElement(By.xpath("//ul[@class='top-menu']//a[@href='/jewelry']"))).perform();
		
		//using contextclick()---->right click
		
		actionsobj.contextClick(driver.findElement(By.xpath("//ul[@class='top-menu']//a[@href='/books']"))).perform();

		System.out.println("execution done succesfully");
		driver.close();
		
	}
}
