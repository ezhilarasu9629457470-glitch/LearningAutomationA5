package LearningProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningVtiger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30l));
		
		driver.get("http://49.249.29.4:8888/");
		
		WebElement usernametxtfield=driver.findElement(By.xpath(""));
		usernametxtfield.sendKeys("admin");
		WebElement passwordtxtfield=driver.findElement(By.xpath(""));
		passwordtxtfield.sendKeys("admin");
		WebElement loginbtn=driver.findElement(By.xpath(""));
		loginbtn.click();
		
		driver.close();

	}

}
