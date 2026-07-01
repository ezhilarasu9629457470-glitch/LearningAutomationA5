package LearningPopUP;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearningNotificationPopup {
	public static void main(String[] args) {
		ChromeOptions co_obj=new ChromeOptions();
		co_obj.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(co_obj);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20l));
		driver.get("https://www.goibibo.com/");
		
		driver.close();  
	}

}
