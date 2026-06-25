package LearningSynchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnSeleniumWaits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40l));
		
		driver.get("https://www.shoppersstack.com/");
		System.out.println(driver.getTitle());
		
		WebElement textvalue=driver.findElement(By.xpath("//h3[contains(text(),'Welcome to ShoppersStack. Enjoy shopping with us.')]"));
		System.out.println(textvalue.getText());
		
		WebElement loginbutton=driver.findElement(By.xpath("//button[contains(text(),'Login')]"));
		loginbutton.click();
		
		System.out.println("program done");
		driver.close();
	}

}
