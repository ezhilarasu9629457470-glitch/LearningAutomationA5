package LearningPopUP;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningAlertHandling {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20l));
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//to handle simple alert
		WebElement simpleAlertButton=driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
		simpleAlertButton.click();
		
		//accept the alert
		driver.switchTo().alert().accept();
		
	
		
		//to handle confirm alert
		WebElement confirmAlertButton=driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
		confirmAlertButton.click();
		
		//accept the alert
		driver.switchTo().alert().accept();
		
		//again click and reject the alert
		WebElement confirmAlertButton1=driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
		confirmAlertButton1.click();
		driver.switchTo().alert().dismiss();
		
		//to handle prompt alert
		WebElement PromptAlertButton=driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
		PromptAlertButton.click();
		
		//get the text 
		String AlertTextValue=driver.switchTo().alert().getText();
		System.out.println(AlertTextValue);
		
		//enter the value and accept
		driver.switchTo().alert().sendKeys("please allow me");
	
		driver.switchTo().alert().accept();
	
		driver.close();
	}

}
