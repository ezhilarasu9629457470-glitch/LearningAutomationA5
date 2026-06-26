package handlingMouseActions;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingKeyboardOperations {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20l));
		driver.get("https://demowebshop.tricentis.com/");
		
		Actions actions=new Actions(driver);
		
	
		
		actions.sendKeys(Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, "book",Keys.ENTER);
		System.out.println("using actions keyboard operation BOOK value is entered in a search textfield");
		driver.close();
	}

}
