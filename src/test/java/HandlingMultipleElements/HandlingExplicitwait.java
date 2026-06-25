package HandlingMultipleElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingExplicitwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30l));
		
		driver.get("https://www.shoppersstack.com/");
		//using visibilityOfElementLocated(By)
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("loginBtn")));
		
		WebElement login=driver.findElement(By.id("loginBtn"));
		login.click();
		
		
		
		//using element to be clickable(By arg)
		wait.until(ExpectedConditions.elementToBeClickable(By.id("vertical-tab-2")));
		WebElement adminlogin=driver.findElement(By.id("vertical-tab-2"));
		adminlogin.click();
		
		//using visibilityof(Referenece variable arg)
		WebElement merchantlogin=driver.findElement(By.id("vertical-tab-1"));
		wait.until(ExpectedConditions.visibilityOf(merchantlogin));
		
		//using texttobe(By arg,String arg)
		wait.until(ExpectedConditions.textToBe(By.xpath("//small[contains(text(),'New to')]"),"New to ShoppersStack ?"));
		System.out.println("element is visible");
		
		//wait.until(ExpectedConditions.alertIsPresent());
		
		driver.close();
		}

}
