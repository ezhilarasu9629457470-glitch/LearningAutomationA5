package ShopZop;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PracticeOwnShopZop {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shopzop.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30l));
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20l));
		
		
		WebElement thatsOkButton=driver.findElement(By.xpath("//button[@class='cm-btn cm-btn-success']"));
		thatsOkButton.click();
		
		WebElement AccountButton=driver.findElement(By.xpath("//span[contains(text(),'Account')]"));
		AccountButton.click();
		
		
		WebElement signinButton=driver.findElement(By.xpath("//a[@data-ca-target-id='login_block494']"));
		signinButton.click();
		
		WebElement emailTextField=driver.findElement(By.xpath("//input[@id='login_popup494']"));
		emailTextField.sendKeys("ezhilarasu9629457470@gmail.com");
		
		WebElement passwordTextField=driver.findElement(By.xpath("//input[@id='psw_popup494']"));
		passwordTextField.sendKeys("Ezhil@@@123");
		
		WebElement Signinusernamebutton=driver.findElement(By.xpath("//bdi[contains(text(),'Sign in')]"));
		Signinusernamebutton.click();
		
		WebElement accountButtonHomePage=driver.findElement(By.xpath("//span[contains(text(),'Account')]"));
		accountButtonHomePage.click();
		
		WebElement signoutButton=driver.findElement(By.xpath("//a[@class='ty-btn ty-btn__primary']"));
		signoutButton.click();
		
		System.out.println("log in and log out both done succesfully");
		driver.close();
	}
	

}
