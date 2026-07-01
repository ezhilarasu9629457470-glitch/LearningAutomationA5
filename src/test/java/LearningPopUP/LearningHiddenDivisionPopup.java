package LearningPopUP;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearningHiddenDivisionPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions cobj=new ChromeOptions();
		cobj.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(cobj);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20l));
		driver.get("https://www.goibibo.com/");
		
		WebElement closeIcon=driver.findElement(By.xpath("//span[@role='presentation']"));
		closeIcon.click();
		
		System.out.println("program done succesfully");
		
		driver.close();

	}

}
