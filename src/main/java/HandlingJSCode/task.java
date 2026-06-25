package HandlingJSCode;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class task {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20l));
		
		//js for navigating to the webpage
		JavascriptExecutor jsobj=(JavascriptExecutor)driver;
		jsobj.executeScript("window.location=arguments[0]","https://automationexercise.com/");
		
		//for refreshing
		jsobj.executeScript("history.go(0)");
		
		//for getting title using js
		
		System.out.println("------------title is--------------------");
		System.out.println(	jsobj.executeScript("return document.title"));
	
		//getting URL using js
		System.out.println("------------url is--------------------");
		System.out.println(jsobj.executeScript("return document.URL"));
		
		
		
		// clicking operation using js
		jsobj.executeScript("arguments[0].click()",driver.findElement(By.partialLinkText("Log")));
		
		//passing values using js
		jsobj.executeScript("arguments[0].value='ezhil'",driver.findElement(By.name("name")));
		jsobj.executeScript("arguments[0].value='ezhil@123'",driver.findElement(By.xpath("//input[@data-qa='signup-email']")));
		
		// clicking operation using js
		jsobj.executeScript("arguments[0].click()", driver.findElement(By.xpath("//button[@data-qa='signup-button']")));
		
		//passing the values by overriding that in a disabled textfield
		jsobj.executeScript("arguments[0].value='selenium@gmail.com'", driver.findElement(By.xpath("//input[@data-qa='email']")));
		System.out.println("email has changed in a disabled element textbox successfully");
		
		//scrolldown using js locators
		Thread.sleep(2000);
		jsobj.executeScript("arguments[0].scrollIntoView(true)", driver.findElement(By.xpath("//b[text()='Address Information']")));
		
		//scroll down using pointer values
		Thread.sleep(2000);
		jsobj.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		jsobj.executeScript("window.scrollTo(0,1000)");
		driver.close();

	}

}
